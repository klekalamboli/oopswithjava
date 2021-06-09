package com.daythree;

import java.util.Scanner;

public class CalculatorUserInput {

	public static void main(String[] args) 
	{
		System.out.println("Program begins here");
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter 1st Value");
		int value1=sc.nextInt();
		System.out.println("Please Enter 2nd Value");
		int value2=sc.nextInt();
		int addition=value1+value2;
		System.out.println("Addition valueone and valuetwo is :"+addition);
		int multiply=value1*value2;
		System.out.println("Multiplication of valueone and valuetwo is :"+multiply);
	}

}
