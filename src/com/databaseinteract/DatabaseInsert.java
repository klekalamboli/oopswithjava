package com.databaseinteract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbURL="jdbc:mysql://localhost:3306/kle";
		String username = "root";
		String password = "tiger";
//		String Query = "insert into employee(empID,empName,empContact) VALUES ('2','def','456');";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1,1);
		ps.setString(2,"abc");
		ps.setInt(3,12345);
		int i = ps.executeUpdate();
		
		
	}

}
