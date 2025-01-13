package com.example.demo;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}


public class ExceptionDemo {
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("age is not correct");
			// throw new IllegalArgumentException("Age must be 18 or older");
		}
		
		// int out = age / 0;
		
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		try {
			checkAge(12);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
		}
	}
	
	

}
