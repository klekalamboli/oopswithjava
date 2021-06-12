package com.daysix;

public class ATMmain extends ATM
{
//	void display()
//	{
//		System.out.println(Cash);
//	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program Begins here");
		ATMmain am = new ATMmain();
//		am.Cash=10;
		am.setCash(30);
		System.out.println(am.getCash());
	}
}
