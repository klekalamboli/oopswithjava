package com.daythree;

import java.util.Scanner;

public class Calculator {
	int valueone;
	int valuetwo;
	Calculator()
	{
		valueone=20;
		valuetwo=30;
	}
	void add()
	{
		int result = valueone+valuetwo;
		System.out.println("Addition is :"+result);
	}
	void multiplication()
	{
		int result = valueone*valuetwo;
		System.out.println("Multiplication is"+result);
	}

	public static void main(String[] args) 
	{
		System.out.println("Program Begins from here");
		Calculator obj1 = new Calculator();
		obj1.add();
		obj1.multiplication();
		
		
	}

}
