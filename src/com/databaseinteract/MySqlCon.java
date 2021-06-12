package com.databaseinteract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbURL="jdbc:mysql://localhost:3306/kle";
		String username = "root";
		String password = "tiger";
//		String selectQuery = "select * from employee where empID=1";
		String selectQuery = "select * from employee";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(selectQuery);
		while(rs.next())
		{
			System.out.println(" empID :"+rs.getInt(1)+ " empName : "+rs.getString(2)+ " empContact "+rs.getInt(3));
		}
		
//		String empID=rs.getString("empID");
//		String empName=rs.getString("empName");
//		String empContact = rs.getString("empContact");
//		System.out.println("  EmpID :"+empID+" empName: "+empName+ " empContact : " +empContact);
		st.close();
		con.close();
		
	}

}
