package com.Overriding;

public class Square extends Shape{
	
	int side;
	
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing square with side : "+side);
	}
	
	public void erase() {
		System.out.println("Erasing square with side : "+side);
	}
}
