package com.Constructor;
import java.util.Scanner;
public class ConstructorDemo {
	String name;
	
	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public ConstructorDemo(String name) {
		System.out.println("Parameterised Constructor");
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name  : ");
		String name = sc.nextLine();
		
		ConstructorDemo obj1= new ConstructorDemo();
		
		obj1.setName(name);
		
		ConstructorDemo obj2 = new ConstructorDemo(obj1.getName());
		
		System.out.println(obj2.getName());
		
		
		
		
	}

}
