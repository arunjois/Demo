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
		String[] ret = new String[20];
		StringJoiner sj = new StringJoiner(",");
		int i=-1;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(  
				//"SELECT name FROM geonames where country_code = \""+ query + "\" " );
				"SELECT name FROM geonames where country_code = \"IN\" " );
			while(rs.next() && i< 10) {
				i++;
				//ret = ret + rs.getString("name");
				//ret=ret + sj.add(rs.getString("name")).toString(); /*Really Function Here*/
				ret[i] = rs.getString("name");
				//ar.add(sj.add(rs.getString("name")));
				ar.add(ret[i]);
				System.out.println(ret[i]);
				//return ar;
				
			}
				
						
			
		} 
		catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		System.exit(0);
		}
		return ar;
		
	}
}