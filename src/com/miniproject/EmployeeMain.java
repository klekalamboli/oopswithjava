package com.miniproject;

import java.util.Scanner;

public class EmployeeMain {
	

	public static void main(String[] args) 
	{
		int empID;
		String empName;
		int empContact;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employee details you want to enter");
		int noOfEmp = sc.nextInt();
		EmployeePojo ep[] = new EmployeePojo[noOfEmp];
//		Add Record
//		Delete Record
//		Update Record
//		Search Record
//		Display Record
//		create menu driven program
		while(true)
		{
			System.out.println("1. Add Employee Record");
			System.out.println("2. Delete Employee Record");
			System.out.println("3. Update Employee Record");
			System.out.println("4. Search Employee Record");
			System.out.println("5. Display all Employee Record");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Welcome to Add Employee Record");
				System.out.println("Enter Number of Employee to be Entered");
				int recordAdd = sc.nextInt();
				for(int i=0;i<recordAdd;i++)
				{
					System.out.println("Enter Employee ID");
					empID = sc.nextInt();
					System.out.println("Enter Employee Name");
					empName = sc.next();
					System.out.println("Enter Employee Contact");
					empContact = sc.nextInt();
					ep[counter] = new EmployeePojo(empID,empName,empContact);
					counter++;
				}
				System.out.println("Employee Records are successfully inserted");
				break;
			case 2:
				System.out.println("Welcome to Delete Employee Record");
				System.out.println("Kindly Enter EmpId of which record you need to delete");
				int deleteRecord = sc.nextInt();
				for(int i=0;i<counter;i++)
				{
					if(ep[i]!=null && ep[i].getEmpID() == deleteRecord)
					{
						System.out.println("Record is found");
						ep[i]= null;
						System.out.println("Record is now deleted");
					}
					
				}
				System.out.println("Delete Operation is Completed");
				break;
			case 3:
				System.out.println("Welcome to Update Employee Record");
				System.out.println("Kindly Enter EmpId of which record you need to update");
				int updateRecord = sc.nextInt();
				for(int i=0;i<counter;i++)
				{
					if(ep[i]!=null && ep[i].getEmpID() == updateRecord)
					{
						System.out.println("Enter Update Value for Employee Name");
						String empNameUpdate = sc.next();
						System.out.println("Enter Update Value for Employee Contact no.");
						int empContactUpdate = sc.nextInt();
						ep[i].setEmpName(empNameUpdate);
						ep[i].setEmpContact(empContactUpdate);
					}
				System.out.println("Update Operation is completed");	
				}
				
				break;
			case 4:
				System.out.println("Welcome to Search Employee Record");
				System.out.println("Kindly Enter EmpId of which record you need to Search");
				int searchRecord = sc.nextInt();
				for(int i=0;i<counter;i++)
				{
					if(ep[i]!=null && ep[i].getEmpID() == searchRecord)
					{
						System.out.println("Record is found");
						System.out.println(ep[i].toString());
					}
				System.out.println("Search Operation is completed");	
				}
				break;
			case 5:
				System.out.println("Welcome to Display all Employee Record"); 
				for(int i=0;i<counter;i++)
				{
					if(ep[i]!=null)
					{
						System.out.println(ep[i].toString());
					}
				}
				System.out.println("Display All Record Operation is performed");
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Please Enter Correct input");
				break;
			}
		}
		
		
	}

}
