package Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpate_jdbc {

	public static void main(String[] args) throws SQLException 
	{
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);

		Connection connection=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet46",
					"root","root");

			Statement cre = connection.createStatement();

			int result = cre.executeUpdate
					("insert into employee values('gowtham','1234','2,00,000','mumbai');");

			if(result==1)
			{
				System.out.println("data added successfully");
			}


		}
		finally
		{
			connection.close();
			System.out.println("connection closed");
		}
	}
}
