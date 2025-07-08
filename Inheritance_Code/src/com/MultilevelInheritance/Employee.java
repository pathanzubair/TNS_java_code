package com.MultilevelInheritance;

public class Employee extends Person {
	private String deptname;
	private long salary;
	public Employee() {
		super();
	}
	public Employee(String name, long contactNo, String deptname,long salary ) {
		super(name, contactNo);
		this.deptname = deptname;
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [deptname=" + getDeptname() + ", salary=" + getSalary() + ", getName()=" + getName()
				+ ", getContactNo()=" + getContactNo() + "]";
	}
	
	
	
	
	
	
	
	

}
