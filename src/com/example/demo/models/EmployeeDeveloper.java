package com.example.demo.models;

public class EmployeeDeveloper extends AbstractEmployee implements Employee {
	
	double hourlyrate;
	int hoursworked;
	double bonus;
	
	public EmployeeDeveloper(String name, int id, double hourlyrate, int hoursworked, double bonus){
		super(name, id);
		this.hourlyrate = hourlyrate;
		this.hoursworked = hoursworked;
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return hourlyrate * hoursworked * bonus;
	}
	
	public void doCodeReviews() {
		
	}

	@Override
	public void paidLeaves() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sickLeave() {
		// TODO Auto-generated method stub
		
	}
}
