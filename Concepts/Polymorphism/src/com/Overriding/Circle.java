package com.Overriding;

public class Circle extends Shape{
	
	double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle with radius : "+radius);
	}
	
	public void erase() {
		System.out.println("Erasing circle with radius : "+radius);
	}

}
