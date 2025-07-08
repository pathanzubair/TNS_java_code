package com.MultilevelInheritance;

public class LevelOneEmployee extends Employee {
	
	private int noOfshares;
	private String authority;
	
	public LevelOneEmployee() {
		super();
	}

	public LevelOneEmployee(String name, long contactNo,String deptname, long salary, int noOfshares,String authority) {
		
		super(name, contactNo, deptname, salary );
	
		this.noOfshares = noOfshares;
		this.authority = authority;
		// TODO Auto-generated constructor stub
	}

	public int getNoOfshares() {
		return noOfshares;
	}

	public void setNoOfshares(int noOfshares) {
		this.noOfshares = noOfshares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee [No Of shares=" + noOfshares + ", Authority =" + authority + ", Deptname ="
				+ getDeptname() + ",Salary =" + getSalary() + ", Name =" + getName() + ", ContactNo ="
				+ getContactNo() + "]";
	}

	
	
	
	
	
	

}
