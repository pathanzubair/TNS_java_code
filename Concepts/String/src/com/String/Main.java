package com.String;

public class Main {

	public static void main(String[] args) {

		//Ways to declare strings
		String str1 = "OM";   // Literal Method
		
		String str2 = new String(" Apple");   // Object Type / new Method
		
		char data[]= {' ','a','p','p','l','e'};  // char array
		String str3 = new String(data);
		
		String str4 = new String (str3);             //reference type
		
		System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4);
		System.out.println("--------------------------------------");
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		System.out.println(str3.length());
		System.out.println(str3.substring(3));
		System.out.println(str3.substring(1, 4));
		System.out.println(str3.trim());
		System.out.println(str3.isEmpty());
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str2));
		System.out.println(str3.charAt(3));
		System.out.println(str3.indexOf('p'));
	}

}
