package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MyTableModel;
import model.ResponsePage;
import model.SearchDB;

/**
 * Servlet implementation class SearchDB
 */
@WebServlet("/search")
public class SearchRequest extends ForwardToJSP {
	private static final long serialVersionUID = 1L;
       
	private ArrayList<String []>  paramsValue;
	private String[] paramsNames = {"valueRegNum", "valueNumber", "valueName", 
									"valueFamily", "plantType[]", "plantLife[]"};
	private String[] paramsSigns = {"signRegNum", "signNumber", "signName", "signFamily"};
	private MyTableModel myModel;
    
	public SearchRequest() {
        super();
        paramsValue = new ArrayList<String[]>();
        myModel = new MyTableModel();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		paramsValue.clear();
		request.setCharacterEncoding("utf-8");
		for(int i=0; i<paramsNames.length; i++)
			if(request.getParameter(paramsNames[i])!=null && !request.getParameter(paramsNames[i]).equals(""))
				switch(i){
				case 0: 
				case 1: 
					String[] parameterNum = {paramsNames[i],
							request.getParameter(paramsSigns[i]) + request.getParameter(paramsNames[i])};
					paramsValue.add(parameterNum);
					break;
				case 2: 
				case 3:
					if(paramsSigns[i].equals("match"))
					{
						String[] parameterText = {paramsNames[i],
								"= " + request.getParameter(paramsNames[i])};
						paramsValue.add(parameterText);
					}
					else
					{
						String[] parameterText = {paramsNames[i],
								"LIKE \'%" + request.getParameter(paramsNames[i])+ "%\'"};
						paramsValue.add(parameterText);
					}
					break;
				default: 
					String[] paramsValues = request.getParameterValues(paramsNames[i]);
					String[] parameterSelect = new String[4];
					parameterSelect[0] = paramsNames[i];
					for(int j=0; j<paramsValues.length; j++)
					{
						parameterSelect[j+1] = "LIKE \'%" + paramsValues[j] + "%\'";
					}
					paramsValue.add(parameterSelect);
					break;
				}
		
		myModel.setData(new SearchDB().getResponse(paramsValue));
		
		String path = getServletContext().getRealPath("");
		File searchRezult = new File(path, "/searchRezult.jsp");
		File tableView = new File(path, "/tableView.jsp");
		ResponsePage page = new ResponsePage();
		
		page.response(path+searchRezult.getName(), myModel, request.getSession());
		page.response(path+tableView.getName(), myModel, true, request.getSession());
		
		super.forward(request, response, searchRezult.getName());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String requestString = "LIKE \'%" + request.getParameter("search") + "%\'";
		myModel.setData(new SearchDB().getResponse(requestString));
		
		String path = getServletContext().getRealPath("");
		File searchRezult = new File(path, "/searchRezult.jsp");
		File tableView = new File(path, "/tableView.jsp");
		ResponsePage page = new ResponsePage();
		
		page.response(path+searchRezult.getName(), myModel, request.getSession());
		page.response(path+tableView.getName(), myModel, true, request.getSession());
		
		super.forward(request, response, searchRezult.getName());
	}
}
