package com.example.demo;

import com.example.demo.models.Student;

public class Utils {
	
	public static double add( double a, double b ) {
		return a + b;
	}
	
	public double multiply( double a, double b ) {
		divide(23,32); // demo using private methods.
		return a * b;
	}
	
	private double divide( double a, double b ) {
		return a / b;
	}
	
	public Student createStudent(String name) {
		return new Student();
	}


}


