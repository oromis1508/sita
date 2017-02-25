package model;

import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class EditDB extends ConnectDB {

	private HttpServletRequest request;
	private String[] oldItems = {"name", "type", "family", "life", "number", "id"};
	private String[] newItems = {"new_name", "new_type", "new_family", "new_life", "new_number"};
	
	public EditDB(HttpServletRequest request) {
		super();
		this.request = request;
		
		editData();
	}

	private void editData() {
		
		try {
		String query;
		Statement stm = super.getStatement();
		
		
		if(!oldItems[0].equals(newItems[0]))
		{
			query = "UPDATE nameplants"
					+ " SET Name = \'" + request.getParameter(newItems[0]) 
					+ "\' WHERE RegNumber = " + request.getParameter(oldItems[5]);
			stm.executeUpdate(query);
		}
		
		if(!oldItems[4].equals(newItems[4]))
		{
			query = "UPDATE numberplants"
					+ " SET Value = " + request.getParameter(newItems[4]) 
					+ " WHERE RegNumber = " + request.getParameter(oldItems[5]);
			stm.executeUpdate(query);
		}
		
		if(!oldItems[0].equals(newItems[0]) || !oldItems[1].equals(newItems[1]) || !oldItems[2].equals(newItems[2]) || !oldItems[3].equals(newItems[3]))
		{
			query = "UPDATE description"
					+ " SET Name = \'" + request.getParameter(newItems[0])
					+ " , Type = \'" + request.getParameter(newItems[1])
					+ " , Family = \'" + request.getParameter(newItems[2])
					+ " , Life = \'" + request.getParameter(newItems[3])
					+ "\' WHERE Name = \'" + request.getParameter(oldItems[0]) + '\'';
			stm.executeUpdate(query);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
