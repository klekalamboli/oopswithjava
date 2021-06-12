package com.miniproject;

public class EmployeePojo 
{
	private int empID;
	private String empName;
	private int empContact;
	public int getEmpID() {
		return empID;
	}
	public EmployeePojo()
	{
		
	}
	public EmployeePojo(int empID, String empName, int empContact) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empContact = empContact;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpContact() {
		return empContact;
	}
	public void setEmpContact(int empContact) {
		this.empContact = empContact;
	}
	@Override
	public String toString() {
		return "EmployeePojo [empID=" + empID + ", empName=" + empName + ", empContact=" + empContact + "]";
	}
	
}
