package com.cybage;

/**
 * Defining a thread By implementing runnable interface
 * 
 * Runnable interface present in Java.lang package, and it contains only one method(run())
 * */

class myRunnable implements Runnable{
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("child thread.");		//executed by child thread.
		}
	}
}

public class Program {
	public static void main(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i <= 5; i++) {
			System.out.println("main thread.");			//executed by main thread.	
		}
	}
}