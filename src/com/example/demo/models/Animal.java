package com.example.demo.models;

public class Animal extends AbstractAnimal {
	
	public String name; 
	public String breed;
	public int age;
	
	public Animal(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	
	protected void speak() {
		System.out.println("Animal sound");
	}


	@Override
	void walk() {
		// TODO Auto-generated method stub
		
	}
	
	void climbtree(){
		
	}
}


