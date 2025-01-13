package com.example.demo;

public class MultiDimensionArrayDemo {

	public static void main(String[] args) {
		
		// int[] marks = { 25, 56, 76 };
		
		String[] names = {"Amit", "John", "Vinay"}; 
		
		int[][] marks = {
				{ 25, 56, 76 },
				{ 45, 55, 23 },
				{ 45, 65, 56 }
		};
		
		int[] total = new int[3];
		
		for (int i= 0; i < names.length; i++) {
			System.out.println("Name: " + names[i]);
			System.out.println("Marks: ");
			total[i] = marks[i][0] + marks[i][1] + marks[i][2];
			System.out.println("Total: " + total[i]);
			for (int j = 0; j < marks[i].length; j++) {
				System.out.println(marks[i][j]);
				
				
			}
		}
		

	}

}
