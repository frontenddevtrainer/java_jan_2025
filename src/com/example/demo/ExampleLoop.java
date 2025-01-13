package com.example.demo;

public class ExampleLoop {

	public static void main(String[] args) {
		
		
//		for(int i = 1; i <=5; i++) {
//			System.out.println("Number: " + i);
//		}
		
		//int i = 1;
		
//		while(i <= 5) {
//			System.out.println("Number: " + i);
//			i++;
//		}
		
		
//		do {
//			System.out.println("Number: " + i);
//			i++;
//		}
//		while ( i <= 5);
		
		int[] numbers = { 10, 15, 20, 25, 30 };
		int[] numbers2 = { 10, 15, 20, 25, 30 };
		
		// 10 * 10
		// 10 * 15
		// ...
		// 15 * 10
		// 15 * 15
		
		// 1, 2
		for (int num : numbers) { 
			// 1, 2, 3, 4, 5
			for (int num2 : numbers2) {
				for(int i = 1; i <=5; i++) {
					System.out.println("(" + num + "," + num2 + "," + i + ")");
				}
			}
			
		}
		
		
		
		
	}

}
