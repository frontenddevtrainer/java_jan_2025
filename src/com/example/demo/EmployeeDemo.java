package com.example.demo;

import com.example.demo.models.EmployeeManager;
import com.example.demo.models.EmployeeDeveloper;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EmployeeManager john = new EmployeeManager("John", 1, 45, 40);
		EmployeeDeveloper amit = new EmployeeDeveloper("Amit", 2, 23, 40, 1);
		
		System.out.println(john.calculateSalary());
		System.out.println(amit.calculateSalary());
		
		john.lunchBreak();
		
	}

}
