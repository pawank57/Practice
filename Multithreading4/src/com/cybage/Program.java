package com.cybage;

class myThread extends Thread{
	
}

public class Program {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		myThread t = new myThread();
		String thread = t.getName();
		System.out.println(thread);
	}
}