package com.example.demo.models;

class Walk {
	
}

public class Dog extends Animal {
	
	public Dog(String name, String breed, int age) {
		super(name, breed, age);
	}
	
	@Override
	public void speak() {
		System.out.println("Dog barks");
	}
	
	public void walk(String location) {
		System.out.println(location);
	}
	
	// walk("living room");
	
	public void walk(int steps) {
		System.out.println("Steps: " + steps);
	}
	
	// walk(5);
	
	public void walk(int steps, String direction) {
		System.out.println("Steps: " + steps + "in " + direction + " direction");
	}
	
	// walk(5, "FORWARD");
	
	//	public void walk(Walk walk) {
	//		if(walk.steps) {
	//			
	//		}
	//		
	//		if(walk.location) {
	//			
	//		}
	//		
	//		if(walk.steps && walk.direction) {
	//			
	//		}
	//	}

}
