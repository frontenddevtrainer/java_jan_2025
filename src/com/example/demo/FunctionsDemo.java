package com.example.demo;

import com.example.demo.models.*;

public class FunctionsDemo {
	
	public static void main(String[] args) {
			
		Utils utils = new Utils();
		//Messages messages = new Messages();
		
		double result = Utils.add(43.55, 545.53);
		System.out.println(result);
		
		double result2 = utils.multiply(45, 23);
		System.out.println(result2);
	
		
		Student amit = utils.createStudent("amit");
		// Student john = utils.createStudent("john");
		Student vinay = utils.createStudent("amit");
		
		vinay.addMarks("eng", 43);
		amit.message();
		studentMessage(vinay);
		
		// Dog dog = new Dog();
		Dog dog = new Dog("lucky", "X", 1);
		Cat cat = new Cat("john", "Y", 2, false); // A
		Cat cat2 = new Cat("kitty", "Z", 5, true); // B
	
		
		
		dog.speak();
		
		dog.walk(5);
		
		dog.walk("living room");
		
		dog.walk(10, "BACKWARD");
		
		
		
		//dog.walk(0).walk(5);
		
//		dog.walkSteps();
//		dog.walkToLocation();
//		dog.walkInDirection();
		
		cat.walk(3).walk(4).totalSteps().walk(5).totalSteps().getInfo();
		
		cat2.walk(10).walk(20).totalSteps().walk(50).totalSteps().getInfo().changeAge(7).getInfo();
		
		
		
	}
	
	
	private static void studentMessage(Student student) {
		student.message();
		// vinay.getMarks("eng")
	}

}
