package com.daythree;

public class MethodInterCall {
	
	void display1()
	{
		System.out.println("inside display 1");
		display2();
	}
	void display2()
	{
		System.out.println("inside display 2");
		display3();
	}void display3()
	{
		System.out.println("inside display 3");
	}

	public static void main(String[] args) 
	{
		MethodInterCall m1= new MethodInterCall();
		m1.display1();
	}

}
