package com.Overriding;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Using array of objects");
		Shape shape[]=new Shape[2];
		shape[0]=new Circle(10.2);
		shape[1]=new Square(10);
		for(Shape i:shape) {
			i.draw();
			i.erase();
		}
		
		System.out.println();
		System.out.println("Using child class objects");
		Circle c1 = new Circle(20);
		c1.draw();
		c1.erase();
		
		Square s1 = new Square(25);
		
		s1.draw();
		s1.erase();

	}

}
