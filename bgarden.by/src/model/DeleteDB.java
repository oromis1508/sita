package model;

import javax.servlet.http.HttpServletRequest;

public class DeleteDB extends ConnectDB {

	private HttpServletRequest request;
	
	public DeleteDB(HttpServletRequest request) {
		super();
		this.request = request;
	}

}
