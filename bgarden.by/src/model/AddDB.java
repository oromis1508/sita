package model;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class AddDB extends ConnectDB {

	private HttpServletRequest request;
	private MyTableModel myModel;
	
	public AddDB(HttpServletRequest request) {
		super();
		this.request = request;
		myModel = new MyTableModel();
		myModel.setData(super.setQuery());
		requestToDB();
	}

	private void requestToDB() {
		
		Integer regNum = 0;
		for(int i=0; i<myModel.getRowCount(); i++)
			if((Integer)myModel.getValueAt(i, 0) > regNum)
				regNum = (Integer) myModel.getValueAt(i, 0);
		regNum++;
		String name = request.getParameter("Name");
		String family = request.getParameter("Family");
		String type = request.getParameter("Type");
		String life = request.getParameter("Life");
		String number = request.getParameter("Number");
		
		try {
			super.getStatement().executeUpdate("INSERT INTO nameplants VALUES (" 
												+ regNum.toString()
												+ ", \'"
												+ name
												+ "\')");
			super.getStatement().executeUpdate("INSERT INTO numberplants VALUES (" 
					+ regNum.toString()
					+ ", "
					+ number
					+ ")");
			
			super.getStatement().executeUpdate("INSERT INTO description VALUES (\'" 
					+ name
					+ "\', \'"
					+ family
					+ "\', \'"
					+ type
					+ "\', \'"
					+ life
					+ "\')");
			
			myModel.setData(super.setQuery());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
