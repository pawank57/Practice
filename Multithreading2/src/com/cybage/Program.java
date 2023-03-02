package com.cybage;

/**
 * Ways to define a thread 1: By extending thread class. 2: By implementing
 * runnable interface. Thread based multi tasking:
 * 
 * If we are not overriding run method, then thread class run method will be
 * executed, which has empty implementation hence we wont get any output.
 */

/**
 * Defining a thread By extending thread class
 * */
class myThread extends Thread {
	public void run() {
		System.out.println("No-Arg run method");
	}

	public void run(int i) {
		System.out.println("Int-Arg run method");
	}

	public void run(int i, double d) {
		System.out.println("Int-double-Arg run method");
	}
}

class myThread1 extends Thread {
	/**
	 * It is highly recommended to override run method, otherwise dont go for
	 * multithreading concept
	 */
}

class myThread2 extends Thread {
	public void start() {
		super.start();
		System.out.println("Start Method.");
	}

	public void run() {
		System.out.println("Run Method");
	}
}

class myThread3 extends Thread {

}

public class Program {
	public static void main(String[] args) throws InterruptedException {
		myThread3 t3 = new myThread3();
		t3.start();
		System.out.println("Thread Started.");
		t3.sleep(1000);
		System.out.println("Waiting...");
//		t3.start(); // java.lang.IllegalThreadStateException
		t3.run();
		System.out.println("Thread Running.");
	}

	// Overriding of Start method.
	public static void main3(String[] args) {
		myThread2 t2 = new myThread2();
		t2.start();
		System.out.println("Main method.");
	}

	public static void main2(String[] args) {
		myThread1 t = new myThread1();
		t.start(); // No output
	}

	public static void main1(String[] args) {
		myThread t = new myThread();
		t.start(); // overloading for run method applicable but thread class
		t.run();
		t.run(10);// start() method always call no-arg run method
		t.run(10, 10.1);
	}
}