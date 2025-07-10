package com.Hybrid_Inheritance;

public class Employee extends Person{

	private int EmpId;
	private String ComName;
	public Employee(long adharNm, long mobile, String name,int EmpId,String ComName) {
		super(adharNm, mobile, name);
		this.EmpId=EmpId;
		this.ComName=ComName;
		
	}
	@Override
	public String toString() {
		return "EmpId=" + EmpId + ", ComName=" + ComName + ", " + super.toString() ;
	}
	
	
	
	
	
	
}