package model;

import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

public class DeleteDB extends ConnectDB {

	private HttpServletRequest request;
	
	public DeleteDB(HttpServletRequest request) {
		super();
		this.request = request;
		deleteData();
	}

	private void deleteData() {
		try {
			
		String query;
		Statement stm = super.getStatement();
		
		query = "DELETE FROM nameplants WHERE RegNumber = " + request.getParameter("id");
		stm.executeUpdate(query);
		query = "DELETE FROM numberplants WHERE RegNumber = " + request.getParameter("id");
		stm.executeUpdate(query);
		query = "DELETE FROM description WHERE Name = \'" + request.getParameter("name") + '\'';
		stm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
