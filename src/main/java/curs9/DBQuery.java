package curs9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBQuery {
	
	public static List<String> dbSelectQuery(Connection conn, String query) {
		List<String> resultList =  new ArrayList<>();
		try {
			Statement statement =  conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				resultList.add(resultSet.getString(2));
			}
			
		}catch(SQLException e) {
			System.out.println("Nu am putut efectua query!");
		}
		return resultList;
	}
	
	public static void dbUpdateQuery(Connection conn, String query) {
		try {
			
			Statement statement =  conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Am facut update!");
			
		}catch(SQLException e) {
			System.out.println("Nu am putut face update!");
			
		}
	}
	
	public static void dbDeleteQuery(Connection conn, String query) {
		try {
			
			Statement statement =  conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Am facut delete!");
			
		}catch(SQLException e) {
			System.out.println("Nu am putut face delete!");
			
		}
	}
	

}
