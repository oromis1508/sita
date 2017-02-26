package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Autentification;
import model.AuthInterface;

/**
 * Servlet implementation class ChangeDataAuth
 */
@WebServlet("/change")
public class ChangeDataAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeDataAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AuthInterface auth = new Autentification();
		
		String login = auth.getValid_login();
		String pass = auth.getValid_pass();
		
		response.getWriter().write(login+','+pass);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AuthInterface auth = new Autentification();
		
		auth.setValid_login_pass(request.getParameter("login")+','+request.getParameter("pass"));
	}

}
