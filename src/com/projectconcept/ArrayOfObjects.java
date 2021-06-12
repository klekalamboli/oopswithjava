package com.projectconcept;

public class ArrayOfObjects 
{
	public static void main(String[] args) 
	{
		ArrayOfObjectsPojo AOP[] = new ArrayOfObjectsPojo[2];		//create array of type object and size 2
		ArrayOfObjectsPojo obj1 = new ArrayOfObjectsPojo(10,20);
		ArrayOfObjectsPojo obj2 = new ArrayOfObjectsPojo();
//		obj1.setI(10);
//		obj1.setJ(20);
		obj2.setI(30);
		obj2.setJ(40);
		AOP[0]=obj1;
		AOP[1]=obj2;
		String result1 = obj1.toString();
		String result2 = obj2.toString();
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
