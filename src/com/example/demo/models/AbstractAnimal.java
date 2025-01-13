package com.example.demo.models;

abstract public class AbstractAnimal {
	
	int age = 1;
	
	abstract void walk();
	
	void sleep() {
		System.out.println("Sleeping");
	}
	
}
