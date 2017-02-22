package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeleteDB;
import model.MyTableModel;

/**
 * Servlet implementation class Action
 */
@WebServlet("/Action")
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MyTableModel myModel;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Action() {
        super();
        myModel = new MyTableModel();
        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("edit")!=null)
		{ 
			String[] names = {"Name", "Type", "Family", "Life", "Number"};
			Cookie cookie = null;
			for(int i=0; i<names.length;i++){
				String str = request.getParameter(myModel.getColumnName(i+1));
				cookie = new Cookie(names[i], str);
				response.addCookie(cookie);}	
			response.sendRedirect("edit.jsp");
		}
		else
			new DeleteDB(request);
		
		//response.sendRedirect("catalog");
	}

}
