package com.example.demo.models;
import com.example.demo.Messages;

interface IStudent {
	String name = "";
	String batch = "";
	String year = "";
	
	Messages message();
	
	void addMarks(String subject, int marks);
	
}

interface ITeachingAssitant {
	void teach();
}

public class Student implements IStudent, ITeachingAssitant{
	
	public Messages message() {
		Messages messages = new Messages();
		return messages;
		
	}
	
	public void addMarks(String subject, int marks) {
		
	}
	
	public void teach() {}
	
	

}
