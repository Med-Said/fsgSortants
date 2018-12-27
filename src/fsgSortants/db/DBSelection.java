package fsgSortants.db;

import java.util.ArrayList;

import java.sql.*;

import fsgSortants.beans.Sortant;

public class DBSelection {
	
	public static ArrayList<Sortant> selectAllSortant(){
		ArrayList<Sortant> res = new ArrayList<>();
		Connection cnx = DBConnection.connection();
		
		try {
			Statement stmt = cnx.createStatement();
			String sql = "select * from sortant";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Sortant s = new Sortant();
				s.setNom(rs.getString("nom"));
				s.setPays(rs.getString("pays"));
				s.setDateCreation(rs.getString("date_creation"));
				s.setPromotion(rs.getString("promotion"));
				s.setSpecialite(rs.getString("specialite"));
				s.setTel(rs.getInt("tel"));
				s.setId(rs.getInt("id"));
				s.setDateNaissance(rs.getString("date_naissance"));
				res.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnection.closeConnection();
		return res;
	}
}
