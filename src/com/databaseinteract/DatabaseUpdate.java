package com.databaseinteract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbURL="jdbc:mysql://localhost:3306/kle";
		String username = "root";
		String password = "tiger";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		PreparedStatement ps = con.prepareStatement("update employee set empID=? where empContact=?");
		ps.setInt(1, 2);
		ps.setInt(2, 12345);
		ps.executeUpdate();
	}

}
