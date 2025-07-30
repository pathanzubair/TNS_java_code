package com.Final;


final class Vehicle {

 final int maxSpeed = 120;

 
 final void displaySpeed() {
     System.out.println("Max speed is: " + maxSpeed + " km/h");
 }
}




public class FinalExample {
 public static void main(String[] args) {
     Vehicle v = new Vehicle();
     v.displaySpeed();

     
 }
}

