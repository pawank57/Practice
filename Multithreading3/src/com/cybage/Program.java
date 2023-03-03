package com.cybage;

/**
 * Defining a thread By implementing runnable interface
 * 
 * Runnable interface present in Java.lang package, and it contains only one
 * method(run())
 * 
 * "Usually this approach is recomended to define a thread."
 */

class myRunnable implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("child thread."); // executed by child thread.
		}
	}
}

public class Program {
	public static void main(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		r.run(); // no new thread will be created and myRunnable run method will be executed like
					// normal method call.
		try {
			t.sleep(1000);
			for (int i = 0; i <= 5; i++) {
				System.out.println("main thread."); // executed by main thread.
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main5(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
//		r.start();				//We will get compile time error: The method start() is undefined for the type myRunnable
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread."); // executed by main thread.
		}
	}

	public static void main4(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread();
		t.run(); // A new thread wont be created and myRunnable run method will be executed just
					// like a normal method call.
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread."); // executed by main thread.
		}
	}

	public static void main3(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread();
		t.start(); // A new thread will be created which is responsible for the execution of
					// myRunnable class run() method.
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread."); // executed by main thread.
		}
	}

	public static void main2(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.run(); // No new thread will be created and thread class run method will be executed
					// just like normal method call.
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread."); // executed by main thread.
		}
	}

	public static void main1(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start(); // A new thread will be created which is responsible for the execution of thread
					// class run method, which has empty implementation.
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread."); // executed by main thread.
		}
	}
}