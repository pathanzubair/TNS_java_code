package com.Hybrid_Inheritance;

public class Manager extends Employee{
	
	private int ManagerId;
	private String Authority;
	
	public Manager(long adharNm, long mobile, String name, int EmpId, String ComName,int ManagerId,String Authority) {
		super(adharNm, mobile, name, EmpId, ComName);
		this.ManagerId=ManagerId;
		this.Authority=Authority;
		
	}

	@Override
	public String toString() {
		return "Manager [ManagerId=" + ManagerId + ", Authority=" + Authority + "," + super.toString()
				+ "]";
	}

	
	
	
	
	
	

}