package com.example.demo.models;

public class Cat extends Animal {
	
	static boolean climbTree = false;
	
	public Cat(String name, String breed, int age, boolean climb) {
		super(name, breed, age);
		
		// this.climbTree = climb;
		
	}
	
	int total = 0;
	
	public Cat walk(int steps) {
		total = total + steps;
		System.out.println("Walked " + steps + " steps");
		return this; // As
	}
	
	public Cat totalSteps() {
		System.out.println("total steps walked: " + total);
		return this;
	}
	
	public Cat getInfo() {
		System.out.println(this.name + this.breed + this.age);
		return this;
	}
	
	public Cat changeAge(int age) {
		this.age = age;
		return this;
	}

}
