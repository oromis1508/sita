package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class ConnectDB {

	private String path;
	private String user;
	private String pass;
	
	private ArrayList<String[]> dataArray;
	
	private Connection conn;
	private String data;
	
	public ConnectDB()
	{
		dataArray = new ArrayList<String[]>();

		this.user = "root";
		this.pass = "root";
		
		this.path = "jdbc:mysql://localhost:3306/flora?useSSL=false";
		
		data = "SELECT "
		+"nameplants.RegNumber, "
		+"nameplants.Name, "
		+"description.Type, "
		+"description.Family, "
		+"description.Life, "
		+"numberplants.Value "
		+"FROM "
		+"nameplants, "
		+"description, "
		+"numberplants "
		+"WHERE "
		+"nameplants.RegNumber=numberplants.RegNumber AND "
		+"nameplants.Name = description.Name";
				
		getConnection();
	}
	
	public void getConnection(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Properties properties=new Properties();
        properties.setProperty("user",user);
        properties.setProperty("password", pass);
        properties.setProperty("useUnicode","true");
        properties.setProperty("characterEncoding","UTF-8");
        
		conn = DriverManager.getConnection(path, properties);
	} catch (SQLException | ClassNotFoundException e2) {
		e2.printStackTrace();
	}
	}
	
	public ArrayList<String[]> setQuery()
	{
		try {
			dataArray.clear();
			Statement ps = conn.createStatement();
			          
			ResultSet rs = ps.executeQuery(data);
			while(rs.next())
			{
				String []row =  {new Integer(rs.getInt(1)).toString(),
								 rs.getString(2),
								 rs.getString(3),
								 rs.getString(4),
								 rs.getString(5),
								 new Integer(rs.getInt(6)).toString()
								 };	
					
				dataArray.add(row.clone());
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dataArray;
	}
	
	public ArrayList<String[]> setQuery(String search)
	{
		try {
			dataArray.clear();
			Statement ps = conn.createStatement();
			          
			ResultSet rs = ps.executeQuery(data+search);
			while(rs.next())
			{
				String []row =  {new Integer(rs.getInt(1)).toString(),
								 rs.getString(2),
								 rs.getString(3),
								 rs.getString(4),
								 rs.getString(5),
								 new Integer(rs.getInt(6)).toString()
								 };	
					
				dataArray.add(row.clone());
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dataArray;
	}
	
	public Statement getStatement() throws SQLException{
		return conn.createStatement();
	}
}
