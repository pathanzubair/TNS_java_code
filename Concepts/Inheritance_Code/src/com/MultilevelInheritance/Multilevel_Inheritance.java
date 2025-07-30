package com.MultilevelInheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Ajay",9099878);
		System.out.println(p1);
		
		Employee e1 = new Employee("Parth", 7878945, "IT", 78000);
		System.out.println(e1);

		LevelOneEmployee l1 = new LevelOneEmployee("Ramesh", 7895456, "ELECT", 80000, 3, "Manager");
		System.out.println(l1);
		
		
	}

}
