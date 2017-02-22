package model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpSession;

public class Autentification {

	private HttpSession session;
	private String login;
	private String pass;
	private String path;
	
	private String before = "<form action=\"Auth\" method=\"post\">";
	
	private String after = "<p>Здравствуйте, администратор!<BR>\n"
			+ "<a href=\"change.jsp\">Изменить логин/пароль</a><BR>\n"
			+ "<form action=\"Logout\" method=\"post\">\n"
			+"<input type=\"submit\" name=\"logout\" value=\"Выйти\">\n"
			+"</form>\n"
			+ "<form action=\"Auth\" method=\"post\" style=\"visibility: hidden;\">";
	
	
	private String valid_login = "admin";
	private String valid_pass = "admin";
	
	public Autentification(String login, String pass, String path, HttpSession session) {
		this.login = login;
		this.pass = pass;
		this.path = path;
		this.session = session;
	}

	public void modify() throws IOException {
		
		Path path = Paths.get(this.path);
		Charset charset = StandardCharsets.UTF_8;
		
		Files.write(path,
			new String(Files.readAllBytes(path), charset)
			    .replace(
			    "<br><font size=\"2\" color=\"red\" face=\"Arial\">Не верно введён логин/пароль</font>","")
			    	.getBytes(charset));
		
		if(login.equals(valid_login) && pass.equals(valid_pass))
		{
			session.setAttribute("auth", true);
			Files.write(path,
	            new String(Files.readAllBytes(path), charset).replace(before, after).getBytes(charset));
		}
		else
			Files.write(path,
		    new String(Files.readAllBytes(path), charset)
		    	.replace("<input type=\"submit\" name=\"submit\" value=\"Авторизация\">",
		    			"<input type=\"submit\" name=\"submit\" value=\"Авторизация\">"+
		    	"<br><font size=\"2\" color=\"red\" face=\"Arial\">Не верно введён логин/пароль</font>")
		    	.getBytes(charset));
	}
	
	public void logout() throws IOException {
		
		Path path = Paths.get(this.path);
		Charset charset = StandardCharsets.UTF_8;
		
		Files.write(path,
	    	new String(Files.readAllBytes(path), charset).replace(after, before).getBytes(charset));
		session.setAttribute("auth", false);
	}

	public void setValid_login(String valid_login) {
		this.valid_login = valid_login;
	}

	public void setValid_pass(String valid_pass) {
		this.valid_pass = valid_pass;
	}
}
