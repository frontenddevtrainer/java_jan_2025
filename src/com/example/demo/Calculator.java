package com.example.demo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		int a = scanner.nextInt();
		
		System.out.println("Enter operator ");
		
		char operator = scanner.next().charAt(0);
		
		System.out.println("Enter second number: ");
		
		int b = scanner.nextInt();
			
		int result;
		
		scanner.close();
		
		switch(operator) {
			
		case '+': 
			result = a + b;
			break;
		
		case '-': 
			result = a - b;
			break;

	
		case '*': 
			result = a * b;
			break;
		
		case '/': 
			result = a / b;
			break;
			
		default : 
			System.out.println("Error");
			return;
		}
		
		System.out.println("Result: " + result);
		
	}

}
