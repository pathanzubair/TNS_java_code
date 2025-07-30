package com.Break;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
