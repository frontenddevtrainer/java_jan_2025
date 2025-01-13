package com.example.demo;


class CounterRunnable implements Runnable {
	public void run() {
		int counter = 0;
		while(true) {
			System.out.println(counter);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
		}
	}
}



class Counter {
	private int count = 0;
	
	public void increment() {
		count++;
		System.out.println(count);
	}
	
	public int getCount() {
		return count;
	}
}

class CounterThread extends Thread {
	
	public Counter counter;
	
	CounterThread(Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		while(true) {
			counter.increment();
		}
	}
	
}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Counter counter = new Counter();
//		CounterThread thread1 = new CounterThread(counter);
//		
//		thread1.start();
//		System.out.println("started");
		
		Runnable task = new CounterRunnable();
		
		Thread thread1 = new Thread(task, "Thread 1");
		
		thread1.start();
		
		
		
	}

}
