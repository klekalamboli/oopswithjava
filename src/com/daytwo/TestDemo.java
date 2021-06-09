package com.daytwo;

public class TestDemo 
{
	{
		System.out.println("This is first block");  //instance block
	}
	{
		System.out.println("This is Second block");  //instance block
	}
	{
		System.out.println("This is Third block");  //instance block
	}
	static {
		System.out.println("This is Static Block "); //Static block
	}
	TestDemo()
	{
		//This is constructor
	}
	int length = 10;			//instance variable
	int height = 20;
			
//	int height = 20; //static variable
	void display()				//member function
	{
		int length = 20;		//local variable
//		this.length = length;	//use of this keyword
		int result= length+height;		
		System.out.println(result);
	}
//	static void display1()				//static method
//	{
//		System.out.println("This is static method");
//	}
	public static void main(String[] args) {
//		System.out.println(TestDemo.height);	//calling static variable
//		TestDemo.display1();					// call static method
		TestDemo obj1 = new TestDemo();		//Instantiation
		TestDemo obj2 = new TestDemo();		// calling block repeatedly
//		TestDemo obj3 = new TestDemo();
//		System.out.println("Value of length :"+obj1.length); //obj1 own state
//		obj1.display();	//obj1 own behaviour
		
		
	}

}
