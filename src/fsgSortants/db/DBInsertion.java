package fsgSortants.db;

import java.sql.*;

public class DBInsertion {
	public static void insertVisiteur(int tel, String mail, String nom,String message) {
		try {
			Connection cnx = DBConnection.connection();
			Statement stmt = cnx.createStatement();
			String sql = "insert into visiteur (tel,mail,nom,message) values "
					+ "('"+tel +"','"+mail +"','"+nom+"','"+message+"')";
			
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnection.closeConnection();
	}
	
}
