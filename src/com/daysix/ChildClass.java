package com.daysix;

import com.dayfive.ClassA;

public class ChildClass extends ClassA implements InterfaceBParent
{
	@Override
	public void parentMethod() 
	{
		System.out.println("inside ChildClass parentMethod");
	}

	public static void main(String[] args) 
	{
		System.out.println("Program Begins here");
		ChildClass cc = new ChildClass();
		cc.parentMethod();
	}

	

}
