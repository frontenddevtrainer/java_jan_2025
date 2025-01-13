package com.example.demo.models;

abstract public class AbstractEmployee {
	String name;
	int id;
	
	// constructor
	AbstractEmployee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Name: " + name + " Id: " + id);
	}
	
	public void lunchBreak() {
		System.out.println("Lunch Break!!!");
	}

}

interface Employee {
	
	void paidLeaves();
	void sickLeave();
}

interface ResignedEmployee {
	
	public boolean resigned = true;
}
