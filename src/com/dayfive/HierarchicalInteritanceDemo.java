package com.dayfive;

public class HierarchicalInteritanceDemo {

	public static void main(String[] args) 
	{
		ClassB cb= new ClassB();
		ClassC cc = new ClassC();
		cb.ClassAMethod();
		cb.ClassBMethod();
		cc.ClassAMethod();
		cc.ClassCMethod();
	}

}
