package fsgSortants.db;

import java.sql.*;

public class DBConnection {
	private final static String user = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://localhost:3306/fsg";
	
	private static  Connection cnx = null;
	
	public static  Connection connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			cnx = (Connection) DriverManager.getConnection(url, user, password);
			return cnx;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConnection() {
		try {
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
