package com.access_modifiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base obj1 = new Base();
		
		
		System.out.println(obj1.varDefault);
		obj1.methodProtected();
		obj1.methodPublic();
		obj1.methodDefault();

	}

}
