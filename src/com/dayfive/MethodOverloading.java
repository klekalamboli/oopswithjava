package com.dayfive;

public class MethodOverloading {

	public static void main(String[] args) {
		CalMultiply cm = new CalMultiply(); //parent class object
		CalAddition ca = new CalAddition(); //child class object
//		cm.addition(); 
		ca.addition(); //overriding and overloading
		ca.addition(10); //overloading
	}

}
