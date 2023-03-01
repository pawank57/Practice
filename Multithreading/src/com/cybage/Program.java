package com.cybage;

/**Ways to define a thread
 * 1: By extending thread class.
 * 2: By implementing runnable interface.
 * Thread based multi tasking:
 * 
 * 
 * */

class myThread extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Child Thread.");
		}
	}
}

class A extends Thread{
	public void run() {
		for( int i = 0; i <= 5; i++) {
			System.out.println("hello");
		}
	}
	
}

public class Program {
	public static void main1(String[] args) {
		myThread mt = new myThread();
		mt.start();						//In the case of t.start a new thread will be created which is responsible for the execution of run method.
		mt.run();						//But in the case of t.run, a new thread wont be created, and the run method will be executed just like a nomal method call by the main thread.
		for ( int j=0; j <= 10; j++) {	
			System.out.println("Main Thread.");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		a.start();
		a.sleep(1000);
//		a.start();						//java.lang.IllegalThreadStateException
		a.run();
	}
}