package com.EH;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		int n1 = 0,n2=0,n3 = 0;
		Scanner sc = new Scanner(System.in);
		try {
			n1=sc.nextInt();
			n2=sc.nextInt();
			try {
				 n3=n1/n2;
				 System.out.println(n3);
			}catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero");
			}
			}
		catch(InputMismatchException a) {
			System.out.println("Invalid input");
		}
		
		
		
		
	}

}
