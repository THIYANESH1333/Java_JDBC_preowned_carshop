package com.thiyaneshcarshop;
import java.sql.DriverManager;
import java.sql.Connection;

public class dbutil {
	public Connection getDBConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carshop","thiyanesh","");
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return con;
		
	}

}
