package com.dayfive;

public class Cidco extends Belapur {
	public void nerul() 
	{
		System.out.println("inside nerul");
	}

	@Override
	public void vashi() 
	{
		System.out.println("inside vashi");
	}

	public static void main(String[] args) 
	{
		Cidco cdo = new Cidco();
		cdo.belapur();
		cdo.nerul();
		cdo.belapur();

	}
}
