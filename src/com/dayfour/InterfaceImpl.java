package com.dayfour;
/*Properties of interface
 * it consist of only non concrete/abstract method
 * mechanism achieve full abstraction
 *  Is-A-Relationships
 */
public interface InterfaceImpl 
{
	int i=10;  //variable of interface are by default public static final
	int j=20;
	void add();					//method are by default public and abstract
	void mulitply();			
	public static void main(String[] args) 
	{
//		InterfaceImpl il = new InterfaceImpl();		//we dont create object of interface
	}
}
