package fsgSortants;

import java.sql.*;

public class DbConnection {
	
	private final static String url = "jdbc:mysql://localhost:3306/fsg";
	private final static String user = "root";
	private final static String password = "";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection cnx = DriverManager.getConnection(url, user, password);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
