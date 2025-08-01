package com.EH;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5};
		try {
			arr[0]=100;
			
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
		}
		finally{
			System.out.println("Code to close conections");
		}
	
	}

}
