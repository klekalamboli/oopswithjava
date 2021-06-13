package com.ems;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException, InterruptedException, IOException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		final String dbURL="jdbc:mysql://localhost:3306/kle";
		final String username = "root";
		final String password = "tiger";
		Connection con = DriverManager.getConnection(dbURL,username,password);
		Scanner sc = new Scanner(System.in);
		while(true)
		{ 
			System.out.println("1. Add");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Display All Record");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter number of record to be entered");
				int addRecord = sc.nextInt();
				for(int i=0;i<addRecord;i++)
				{
					System.out.println("enter empID");
					int empIDAcceptFromUsertoInsert = sc.nextInt();
					System.out.println("enter empName");
					String empNameAcceptFromUsertoInsert = sc.next();
					System.out.println("enter empContact");
					int empContactAcceptFromUsertoInsert = sc.nextInt();
					PreparedStatement pstoInsert = con.prepareStatement("insert into employee values(?,?,?)");
					pstoInsert.setInt(1,empIDAcceptFromUsertoInsert);
					pstoInsert.setString(2,empNameAcceptFromUsertoInsert);
					pstoInsert.setInt(3,empContactAcceptFromUsertoInsert);
					int recordInsert = pstoInsert.executeUpdate();
					System.out.println(recordInsert+" Record is inserted");
				}
				break;
			case 2:
					System.out.println("enter empID to be searched");
					int empIDAcceptFromUser = sc.nextInt();
					PreparedStatement pstoSearch = con.prepareStatement("select * from employee where empID=?)");
					pstoSearch.setInt(1,empIDAcceptFromUser);
					ResultSet recordSelect = pstoSearch.executeQuery();
					while(recordSelect.next())
					{
						System.out.println(" empID :"+recordSelect.getInt(1)+ " empName : "+recordSelect.getString(2)+ " empContact "+recordSelect.getInt(3));
					}
					pstoSearch.close();
				break;
			case 3:
				System.out.println("enter empID which record you had to update");
				int empIDAcceptFromUsertoUpdate = sc.nextInt();
				System.out.println("enter updated empName");
				String empNameAcceptFromUsertoUpdate = sc.next();
				System.out.println("enter updated empContact");
				int empContactAcceptFromUsertoUpdate = sc.nextInt();
				PreparedStatement pstoUpdate = con.prepareStatement("update employee set empName=? , empContact=? where empID=?");
				pstoUpdate.setString(1,empNameAcceptFromUsertoUpdate);
				pstoUpdate.setInt(2,empContactAcceptFromUsertoUpdate);
				pstoUpdate.setInt(3,empIDAcceptFromUsertoUpdate);
				int recordUpdate = pstoUpdate.executeUpdate();
				System.out.println(recordUpdate+" Record is Updated");
				pstoUpdate.close();
				break;
			case 4:
				System.out.println("Enter empID to be Deleted");
				int empIDtoBeDeleted = sc.nextInt();
				PreparedStatement pstoDelete = con.prepareStatement("delete from employee where empID=?");
				pstoDelete.setInt(1, empIDtoBeDeleted);
				int recordDelete = pstoDelete.executeUpdate();
				System.out.println(recordDelete+" Record is Deleted");
				break;
			case 5:
				String DisplayQuery = "select * from employee";
				Statement st = con.createStatement();
				ResultSet recordDisplay = st.executeQuery(DisplayQuery);
				while(recordDisplay.next())
				{
					System.out.println(" empID :"+recordDisplay.getInt(1)+ " empName : "+recordDisplay.getString(2)+ " empContact "+recordDisplay.getInt(3));
				}
				st.close();
				break;
			case 6:
				con.close();
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter Right Choice");
				break;
			}
		}
	}

}
