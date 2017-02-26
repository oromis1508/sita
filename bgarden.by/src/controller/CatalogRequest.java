package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConnectDB;
import model.MyTableModel;
import model.ResponsePage;


@WebServlet("/catalog")
public class CatalogRequest extends ForwardToJSP{
	private static final long serialVersionUID = 1L;
	private ConnectDB cdb;   
	private MyTableModel myModel;
   
	public CatalogRequest() {
        super();
        cdb = new ConnectDB();
        myModel = new MyTableModel();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		myModel.setData(cdb.setQuery());
		String path = getServletContext().getRealPath("");
		File catalog = new File(path, "/catalog.jsp");
		File tableView = new File(path, "/tableView.jsp");
		ResponsePage page = new ResponsePage();
		
		page.response(path+catalog.getName(), myModel, request.getSession());
		page.response(path+tableView.getName(), myModel, true, request.getSession());
		
		super.forward(request, response, catalog.getName());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
