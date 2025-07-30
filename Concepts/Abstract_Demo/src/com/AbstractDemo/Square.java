package com.AbstractDemo;

public class Square extends Shape{

	private double side;
	
	

	public Square(double side) {
		this.side = side;
	}

	@Override
	void calArea() {
		area=side*side;
		
	}

	@Override
	void showArea() {
		System.out.println("Area of Square : "+area);
		
	}
	
}
