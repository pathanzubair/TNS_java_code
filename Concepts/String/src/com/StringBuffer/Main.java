package com.StringBuffer;

public class Main {

	public static void main(String[] args) {
		
		String s = "World";
		StringBuffer str = new StringBuffer("Hello ");
		StringBuffer str1 = new StringBuffer(s);
		System.out.println(str.append(s));

	}

}
