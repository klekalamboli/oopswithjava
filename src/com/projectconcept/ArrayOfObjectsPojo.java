package com.projectconcept;

public class ArrayOfObjectsPojo 
{
	private int i;
	private int j;
	public ArrayOfObjectsPojo(int i, int j) 
	{
		this.i=i;
		this.j=j;
	}
	public ArrayOfObjectsPojo() 
	{
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "ArrayOfObjectsPojo [i=" + i + ", j=" + j + "]";
	}
	
}
