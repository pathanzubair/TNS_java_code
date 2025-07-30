package com.String;
import java.util.*;
public class Main {
	
	static String calculateAns(String input) {
	
		StringBuffer  lower = new StringBuffer();
		StringBuffer  upper = new StringBuffer();
		for(char c : input.toCharArray()) {
			if(Character.isUpperCase(c)) {
				upper.append(c);
			}else {
				lower.append(c);
			}
			
		}
		 return lower.toString() + upper.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.nextLine();		
		
		System.out.println(calculateAns(input).trim());

	}

}
