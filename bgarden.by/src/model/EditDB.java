package model;

import javax.servlet.http.HttpServletRequest;

public class EditDB extends ConnectDB {

	private HttpServletRequest request;
	
	public EditDB(HttpServletRequest request) {
		super();
		this.request = request;
	}
	
	

}
