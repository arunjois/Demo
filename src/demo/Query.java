package demo;

import java.sql.*;
import java.util.StringJoiner;
import java.util.List;
import java.util.ArrayList;
public class Query {
	
	public static void main(String args[]) {
		Connection c = null;
		Statement stmt = null;
		//Demo d = new Demo();
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:~/test.db");
			Demo d = new Demo();
		} 
		catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		System.exit(0);
		}
		
		
	}
	List getCountryIso(String query)
	{
		ResultSet set;
		Connection c = null;
		Statement stmt = null;
		List ar = new ArrayList();
		//String[] ret = new String[ar.length];
		StringJoiner sj = new StringJoiner(",");
		int i=0;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(  
				//"SELECT name FROM geonames where country_code = \""+ query + "\" " );
				"SELECT name FROM geonames where country_code = \"IN\" " );
			while(rs.next()) {
				
				//ret[i] = rs.getString("name");
				ar.add(rs.getString("name"));
				i++;
				
			}
			
		} 
		catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		System.exit(0);
		}
		return ar;
		
	}
}