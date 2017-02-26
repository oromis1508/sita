package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddDB;


@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Add() {
        super();
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		new AddDB(request);
//		request.getRequestDispatcher("catalog").forward(request, response);
		response.sendRedirect("catalog");
	}
}
