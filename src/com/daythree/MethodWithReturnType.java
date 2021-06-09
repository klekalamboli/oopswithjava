package com.daythree;

import java.util.Scanner;

public class MethodWithReturnType 
{	
	int add(int number1,int number2)
	{
		int result=number1+number2;
		return result;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 Value");
		int a=sc.nextInt();
		System.out.println("Enter 2 Value");
		int b=sc.nextInt();
		MethodWithReturnType mwr1 = new MethodWithReturnType();
		int resultOfAddition = mwr1.add(a, b);
		System.out.println("Addition of "+a+" and "+b+" is "+resultOfAddition);
		
	}

}
