package com.daythree;

public class CalculatorMethodwithParam 
{
	int number1;
	int number2;
	CalculatorMethodwithParam()
	{
		
	}
	CalculatorMethodwithParam(int num1,int num2)
	{
		number1=num1;
		number2=num2;
	}
	void add(int num1, int num2)
	{
		int result = num1+num2;
		System.out.println("Addition is"+result);
	}
	void multiplication(int num1,int num2)
	{
		int result=num1*num2;
		System.out.println("Multiplication is"+result);
	}
	public static void main(String[] args) 
	{
		CalculatorMethodwithParam pmp1 = new CalculatorMethodwithParam();
		CalculatorMethodwithParam pmp2 = new CalculatorMethodwithParam(10,20);
		pmp1.add(25, 50);
		pmp2.add(120, 130);
		pmp1.multiplication(5, 5);
		pmp2.multiplication(15, 15);
		
	}

}
