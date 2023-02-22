package com.cybage;

/**
 * Based on the person who is rising an exception, all exceptions are divided
 * into two categories: 1.JVM exceptions -Exceptions which are rised
 * automatically by jvm when ever a perticular event occurs are called JVM
 * exceptions. eg: Arithmatic Exception, null pointer exception, etc.
 * 2.Programmatic Exceptions -Exceptions which are rised explicitly either by
 * programmer or by api developer to indicate that something goes wrong are
 * called programmatic exceptions. eg: TooOldException, tooYoungException,
 * illegalArgumentException, etc.
 * 
 */

public class Program {
	public static void main(String[] args) {
		int x = 0;
		assert (x > 10);
	}

	public static void main8(String[] args) {
		Thread t = new Thread();
		t.start();
		/** Once the thread is started, it cannot be started again. */
		t.start(); // RE:java.lang.IllegalThreadStateException
	}

	public static void main7(String[] args) {
//		int i = Integer.parseInt("10");			//10
		int i = Integer.parseInt("Ten"); // RE: java.lang.NumberFormatException:
		System.out.println(i);
	}

	public static void main6(String[] args) {
//		static int x = 10/0;					//CE: Illegal modifier
	}

	public static void m1() {
		m2();
	}

	public static void m2() {
		m1();
	}

	public static void main5(String[] args) {
		m2(); // StackOverflowError
	}

	public static void main4(String[] args) {
		Object o = new Object();
		String s = (String) o; // java.lang.ClassCastException: //Parent object cannot be typecasted to child.
	}

	public static void main3(String[] args) {
		String s = new String("Pawan");
		Object o = s; // Child object can be typecasted to parent.
		System.out.println(o);
	}

	public static void main2(String[] args) {
		String s = null;
		System.out.println(s.length()); // RE: java.lang.NullPointerException:
	}

	public static void main1(String[] args) {
		int[] arr = new int[4];
		System.out.println(arr[0]);
		System.out.println(arr[10]); // RE: ArrayIndexOutOfBoundsException:
//		System.out.println(arr[-10]);
	}
}