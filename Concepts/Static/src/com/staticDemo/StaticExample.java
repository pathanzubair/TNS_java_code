package com.staticDemo;

public class StaticExample {

    // Static variable
    static int count = 0;

    // Instance variable
    int id;

    // Static block 
    static {
        System.out.println("Class and Static block loaded.");
    }

    // Constructor
    StaticExample() {
        count++; 
        id = count;
    }

    // Static method
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    // Static nested class
    static class Nested {
        void show() {
            System.out.println("Inside static nested class.");
        }
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();
        
         
        displayCount();

        StaticExample.Nested nestedObj = new StaticExample.Nested(); 
        nestedObj.show();
    }
}
