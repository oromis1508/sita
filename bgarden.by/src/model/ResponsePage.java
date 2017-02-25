package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.http.HttpSession;

public class ResponsePage {
	
	public void response(String outputFileURL, MyTableModel myModel, HttpSession session) throws IOException
	{
	
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileURL));
		
		bw.write("<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\""
		+" pageEncoding=\"UTF-8\"%>\n"
		+"<!DOCTYPE html>\n"
		+"<html>\n"
		+"<head>\n"
		+"<meta charset=\"UTF-8\">\n"
		+"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
		+"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/catalog.css\">\n"
		+"<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n"
		+"<script src=\"js/script.js\" type=\"text/javascript\"></script>\n"
		+"<script type=\"text/javascript\" src=\"js/jqcatalog.js\"></script>\n"
		+"<title>Каталог растений ботанического сада</title>\n"
		+"</head>\n"
		+"<body>\n"
		+"<div class=\"wrapper\">\n"
		+"<%@ include file=\"header.jsp\" %>\n"
		
		+"<%@ include file=\"navigation.jsp\" %>\n"
		+"<main>\n");bw.flush();
		
		if(myModel.getRowCount()==0)
			bw.write("<h1>По вашему запросу ничего не найдено!</h1>");
		
		bw.write("<table>\n");
		
		for(int i=0; i<myModel.getRowCount(); i++)
		{	
			if(i%4==0)
				bw.write("<tr>");
			bw.write("<td>\n"
					+"<article>\n"
					+"<header>\n");
			for(int j=0; j<myModel.getColumnCount()-1; j++)
			{
				 if(j>1)
					 bw.write("<p>"+myModel.getColumnName(j) + ": <BR>");
				 
				 if(j==1)
					 bw.write("<h5>");
				 if(j==0)
					 bw.write("<h4>");
				 
				 bw.write("<i>"+myModel.getValueAt(i, j).toString() + "</i></p>\n");
				 
				 if(j==0)
					 bw.write("</h4>");
				 
				 bw.write("<BR>");
				 if(j==1)
					 bw.write("</h5>\n"
					 		+ "</header>\n"
					 		+ "<main>\n");
			}
			bw.write("<img src=\"/bgarden.by/images/catalog/" + myModel.getValueAt(i, 1).toString() +".jpg\">\n");
			
			if(session.getAttribute("auth")!=null && (boolean)session.getAttribute("auth"))
			{
				String[] names = {"id", "name", "type", "family", "life", "number"};
				bw.write("<button class=\"editbtn\" data-action=\"edit\"");
			for(int j=0; j<myModel.getColumnCount(); j++)
				bw.write(" data-" + names[j]
						+ "=\"" + myModel.getValueAt(i, j).toString() + "\"");
			bw.write(">Редактировать</button>");
			
			bw.write("<button class=\"deletebtn\" data-action=\"delete\"");
			for(int j=0; j<myModel.getColumnCount(); j++)
				bw.write(" data-" + names[j]
						+ "=\"" + myModel.getValueAt(i, j).toString() + "\"");
			bw.write(">Удалить</button>");	
			}	
						
			bw.write("</main>\n"
					+ "<footer>\n"
					+ myModel.getColumnName(myModel.getColumnCount()-1) + ": <span>"
					+ myModel.getValueAt(i, myModel.getColumnCount()-1).toString() + "</span>\n"
					+ "</footer>\n");
			
			
			bw.write("</article>\n"
					+"</td>\n");
			if((i+1)%4==0)
				bw.write("</tr>");
			bw.flush();
		}
		
		bw.write("</table>\n");
		bw.write("<ul class=\"nav_catalog\">");
		
		if(session.getAttribute("auth")!=null && (boolean)session.getAttribute("auth"))
			bw.write("<li><a href=\"add.jsp\">Добавить запись</a>\n");
		
		if(myModel.getRowCount()!=0)
			bw.write("<li><a href=\"tableView.jsp\">К табличному виду</a>\n");
		
		bw.write("<li><a onclick=\"history.back();\">Назад</a>\n");
		
		bw.write("</main>\n"
		+"<%@ include file=\"footer.jsp\" %>\n"
		+"</div>"
		+"</body>"); bw.flush();
		
		bw.close();
	}

	public void response(String outputFileURL, MyTableModel myModel, boolean flag, HttpSession session) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileURL));
		
		bw.write("<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\""
		+" pageEncoding=\"UTF-8\"%>\n"
		+"<!DOCTYPE html>\n"
		+"<html>\n"
		+"<head>\n"
		+"<meta charset=\"UTF-8\">\n"
		+"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
		+"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/catalog.css\">\n"
		+"<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n"
		+"<script src=\"js/script.js\" type=\"text/javascript\"></script>\n"
		+"<script type=\"text/javascript\" src=\"js/jqcatalog.js\"></script>\n"
		+"<title>Каталог растений ботанического сада</title>\n"
		+"</head>\n"
		+"<body>\n"
		+"<div class=\"wrapper\">\n"
		+"<%@ include file=\"header.jsp\" %>\n"
		
		+"<%@ include file=\"navigation.jsp\" %>\n"
		+"<main>\n");bw.flush();
		
		bw.write("<table class=\"catalog\">\n"
				+ "<tr>");
		for(int i=0; i<myModel.getColumnCount(); i++)
			bw.write("<th>"
					+myModel.getColumnName(i)
					+"</th>");
		bw.write("<tr>");
		
		for(int i=0; i<myModel.getRowCount(); i++)
		{	
			bw.write("<tr>");
			for(int j=0; j<myModel.getColumnCount(); j++)
				bw.write("<td>"
						+myModel.getValueAt(i, j)
						+"</td>");
			
			if(session.getAttribute("auth")!=null && (boolean)session.getAttribute("auth"))
			{
				String[] names = {"id", "name", "type", "family", "life", "number"};
				bw.write("<td><button class=\"editbtn\" data-action=\"edit\"");
			for(int j=0; j<myModel.getColumnCount(); j++)
				bw.write(" data-" + names[j]
						+ "=\"" + myModel.getValueAt(i, j).toString() + "\"");
			bw.write(">Редактировать</button></td>");

			bw.write("<td><button class=\"deletebtn\" data-action=\"delete\"");
			for(int j=0; j<myModel.getColumnCount(); j++)
				bw.write(" data-" + names[j]
						+ "=\"" + myModel.getValueAt(i, j).toString() + "\"");
			bw.write(">Удалить</button></td>");
			bw.write("</tr>");
			}	
						
			bw.write("</main>\n"
					+ "<footer>\n"
					+ myModel.getColumnName(myModel.getColumnCount()-1) + ": <span>"
					+ myModel.getValueAt(i, myModel.getColumnCount()-1).toString() + "</span>\n"
					+ "</footer>\n");
			
			
			bw.write("</article>\n"
					+"</td>\n");
			if((i+1)%4==0)
				bw.write("</tr>");
			bw.flush();
		}
		
		
		bw.write("</table>\n");
		bw.write("<ul class=\"nav_catalog\">");
		
		if(session.getAttribute("auth")!=null && (boolean)session.getAttribute("auth"))
			bw.write("<li><a href=\"add.jsp\">Добавить запись</a>\n");
		
		bw.write("<li><a onclick=\"history.back();\">К блочному виду</a>"
				+ "<li><a onclick=\"history.back();\">Назад</a>\n");
		
		bw.write("</main>\n"
		+"<%@ include file=\"footer.jsp\" %>\n"
		+"</div>"
		+"</body>"); bw.flush();
		
		bw.close();
	}
}
