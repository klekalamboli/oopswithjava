package com.dayfour;
/*
 * abstract class maybe blank
 */

public abstract class AbstractClassProperty 
{	
	public AbstractClassProperty() {
	}
	abstract void add();		//abstract method or non-concrete or method with no body
	void multiply()						//non-abstract method or concrete method or method with body
	{
		System.out.println("inside multiply");
	}


}
