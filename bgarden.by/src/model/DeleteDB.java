package model;

import javax.servlet.http.HttpServletRequest;

public class DeleteDB extends ConnectDB {

	private HttpServletRequest request;
	private String[] names = {"id", "name", "type", "family", "life", "number"};;
	
	public DeleteDB(HttpServletRequest request) {
		super();
		this.request = request;
	}

}
