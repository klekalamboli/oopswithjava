package com.daythree;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Define size of array");
		int sizeOfArray = sc.nextInt();
		int[] arr1= new int[sizeOfArray];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter Value at "+i+" Index");
			arr1[i]=sc.nextInt();	
			System.out.println("at Index"+i+" value "+arr1[i]+" is inserted");
		}
		System.out.println("Printing all Values");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
