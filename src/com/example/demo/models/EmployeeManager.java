package com.example.demo.models;

public class EmployeeManager extends AbstractEmployee implements Employee, ResignedEmployee {
	
	double hourlyrate;
	int hoursworked;
	
	public EmployeeManager(String name, int id, double hourlyrate, int hoursworked){
		super(name, id);
		this.hourlyrate = hourlyrate;
		this.hoursworked = hoursworked;
	}
	
	@Override
	public double calculateSalary() {
		return hourlyrate * hoursworked;
	}
	
	public void peopleReview() {
		System.out.println("Reviews");
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