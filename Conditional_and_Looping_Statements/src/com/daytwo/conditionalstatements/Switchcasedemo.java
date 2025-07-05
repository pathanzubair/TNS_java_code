package com.daytwo.conditionalstatements;
import java.util.Scanner;


public class Switchcasedemo {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

		// TODO Auto-generated method stub
        char x = scanner.nextLine().charAt(0);
		
		switch(x)
		{
		case 'l':
			System.out.print("This code contains letter.");
			break;
			
		case 'd':
			System.out.print("This code contains digits.");
			break;
			
		case 's':
			System.out.print("This code contains symbols.");
			break;
			
		case 'w':
			System.out.print("This code contains whitespaces.");
			break;
			
		default:
			System.out.println("This code does not contains any letters, symbols , digits and whitespaces");
			break;
		}
		
	}

}
