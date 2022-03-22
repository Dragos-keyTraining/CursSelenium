package curs9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	
	public static Connection openDbConnection(String hostname, String user, String password) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(hostname, user, password);
			System.out.println("Conexiune cu sucess!");
			
		}catch(SQLException e) {
			System.out.println("Nu am putut face conexiunea!");
		}	
		return conn;
	}
	
	
	
	public static void closeDBconnection(Connection conn) {
	
		try {
			System.out.println("Incerc sa inchid conexiunea!");
			conn.close();
			System.out.println("Am inchis conexiunea!");

		}catch(SQLException e) {
			System.out.println("Nu am putut inchide conexiunea!");

		}
		
		
	}

}
