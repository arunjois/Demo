package demo;

import java.sql.*;
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
	String getCountryIso(String query)
	{
		ResultSet set;
		Connection c = null;
		Statement stmt = null;		
		String ret = new String();
		ret = "";
		int i=0;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(  
				//"SELECT name FROM geonames where country_code = \""+ query + "\" " );
				"SELECT name FROM geonames where country_code = \"IN\" " );
			while(rs.next() && i< 10) {
				i++;
				ret = ret + rs.getString("name") + ",";
				//System.out.println(ret);
			}
				
						
			
		} 
		catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		System.exit(0);
		}
		System.out.println(ret);
		return ret;
	}
}