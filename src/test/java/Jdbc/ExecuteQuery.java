package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {

	public static void main(String[] args) throws SQLException {

		Driver dbDriver = new Driver();
		DriverManager.registerDriver(dbDriver);
		
		Connection connection=null ;
try {
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet46","root","root");
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("select * from employee");
		
		while(result.next())
		{
			String ename = result.getString("ename");
			String empid = result.getString("sal");
			System.out.println(ename+ " " +empid);
			
		}
		}
		finally
		{
			connection.close();
			System.out.println("connection closed");
		}

	}

}
