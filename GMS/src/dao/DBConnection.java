package dao;

import java.sql.Connection;
import java.sql.DriverManager;


// factory method design pattern class
public class DBConnection {
	Connection connect = null;
	// private constructor to not visible
	private DBConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gymdb", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
	
	}

	}
	// factory method which is returning same class object refernce
	public static DBConnection getConnection()
	{
		DBConnection connection=new DBConnection();
		return connection;
	}
	public  Connection getInstance()
	{
		return connect;
	}
	

}
