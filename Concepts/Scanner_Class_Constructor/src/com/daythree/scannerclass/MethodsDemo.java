package com.daythree.scannerclass;
//import java.util.Scanner;
public class MethodsDemo {
	int m = 44;  // Instance Variable
	public void addition() {
		int x = 20;			// local variable
		int y = 10;			// local variable
		int sum = x+y;
		System.out.println("Addition of numbers = "+sum);
		System.out.println("Instance Variable = "+m);
	}
	
	public void subtraction() {
		int x = 20;			// local variable
		int y = 10;			// local variable
		int diff = x-y;
		System.out.println("Subtraction of numbers = "+diff);
	}
	
//	Parameterized Method
	
	public void multiply(int a , int b) {

		int pro = a*b;
		System.out.println("Multiplition of numbers = "+pro);
	}
	
	

	public static void main(String[] args) {
//		Scanner input = new scanner(System.in);
		MethodsDemo obj1 = new MethodsDemo();
		obj1.addition();
		obj1.subtraction();
		obj1.multiply(19, 4);
		
	}


}
