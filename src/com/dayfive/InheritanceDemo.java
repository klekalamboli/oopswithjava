package com.dayfive;

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		CalAddition ca = new CalAddition();
//		CalMultiply cm = new CalMultiply();
//		cm.addition();   //called parent class method
//		cm.mulitply(); 	//called its own methods
//		ca.mulitply();
//		ca.mulitply();
		CallSubstraction cs = new CallSubstraction();
		cs.multiply();		//Class A method
		cs.addition();		//class B method
		cs.substract();		//class c method
		
		
	}

}
