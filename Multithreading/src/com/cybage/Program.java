package com.cybage;

/**Ways to define a thread
 * 1: By extending thread class.
 * 2: By implementing runnable interface.
 * Thread based multi tasking:
 * 
 * 
 * */

class A extends Thread{
	public void run() {
		for( int i = 0; i <= 5; i++) {
			System.out.println("hello");
		}
	}
	
}

public class Program {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		a.start();
		a.sleep(1000);
		a.run();
	}
}