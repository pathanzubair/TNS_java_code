package com.Break;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<=10;j++) {
				if(i%2==0) {
					break;
				}
				else {
					System.out.println(i*j);
				}
			}
			System.out.println("======");
		}

	}

}
