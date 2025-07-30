package com.MethodOverloading;

public class OverloadingDemo {

	public void isPallindrome(int num) {
		int copy = num,rev=0;
		while(copy!=0) {
			rev=rev*10+copy%10;
			copy/=10;	
			
		}
		if(num==rev) {
			System.out.println(num+ " is Pallindrome");
		}
		else {
			System.out.println(num+" is not Pallindrome");
		}
		
	}
	
	public void isPallindrome(String str) {
		
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		if(str.equals(reversed)) {
			System.out.println(str+ " is Pallindrome");
		}
		else {
			System.out.println(str+" is not Pallindrome");
		}
		
	}
}
