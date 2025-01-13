package com.example.demo;

public class DemoHelloWorld {

	public static void main(String[] args) {
		
	//		int age = 15;
	//		
	//		if(age >= 18) {
	//			System.out.println("You are eligible to vote");
	//		}
	//		else {
	//			System.out.println("You are not eligible to vote");
	//		}
		
	
	//	int score = 80;
	//	
	//	if(score >= 80) {
	//		System.out.println("Grade A");
	//	} else if (score >= 75) {
	//		System.out.println("Grade B");
	//	}
	//	else if (score >= 50) {
	//		System.out.println("Grade C");
	//	}
	//	else {
	//		System.out.println("Grade F");
	//	}
		
	int day = 7;
	
	switch (day) {
		
	case 1 : 
		System.out.println("Monday");
		break;
	
	case 2 : 
		System.out.println("Tuesday");
		break;

	
	case 3 : 
		System.out.println("Wednesday");
		break;
		
		
	case 4 : 
		System.out.println("Thursday");
		break;
		
	case 5 : 
		System.out.println("Friday");
		break;
		
	case 6 : 
		System.out.println("Saturday");
		break;
		
	case 7 : 
		System.out.println("Sunday");
		break;

	
	default :
		System.out.println("Invalid Day");
	}
		
}

}