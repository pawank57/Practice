package com.cybage;

/**Ways to define a thread
 * 1: By extending thread class.
 * 2: By implementing runnable interface.
 * Thread based multi tasking:
 * */

class myThread extends Thread{
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

public class Program{
	public static void main(String[] args) {
		myThread t =  new myThread();
		t.start();					//overloading for run method applicable but thread class
		t.run();
		t.run(10);//start() method always call no-arg run method
		t.run(10, 10.1);
	}
}