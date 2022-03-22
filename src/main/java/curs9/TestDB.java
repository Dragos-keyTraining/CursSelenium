package curs9;

import java.sql.Connection;

public class TestDB {
	
	static String hostname = "jdbc:mysql://....";
	static String user = "";
	static String password = "";

	
	
	public static void main(String[] args) {
		
		Connection conn =  DBConn.openDbConnection(hostname, user, password);
		
		System.out.println(DBQuery.dbSelectQuery(conn, QueryStatements.SELECT.getQuery()));
		DBQuery.dbUpdateQuery(conn, QueryStatements.UPDATE_CUSTOMER.getQuery());
		System.out.println(DBQuery.dbSelectQuery(conn, QueryStatements.SELECT.getQuery()));

		DBConn.closeDBconnection(conn);
		
		
	}

}
