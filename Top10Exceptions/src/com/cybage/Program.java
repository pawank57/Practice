package com.cybage;

/**Based on the person who is rising an exception, all exceptions are divided into 
 * two categories:
 * 1.JVM exceptions
 * -Exceptions which are rised automatically by jvm when ever a perticular event occurs are called
 * JVM exceptions.
 * eg: Arithmatic Exception, null pointer exception, etc. 
 * 2.Programmatic Exceptions
 * -Exceptions which are rised explicitly either by programmer or by api developer
 * to indicate that something goes wrong are called programmatic exceptions.
 * eg: TooOldException, tooYoungException, illegalArgumentException, etc.
 * 
 * */

public class Program{
	public static void main(String[] args) {
		
	}
	
	public static void main4(String[] args) {
		Object o = new Object();
		String s = (String) o;					//java.lang.ClassCastException:   //Parent object cannot be typecasted to child.
	}
	
	public static void main3(String[] args) {
		String s = new String("Pawan");
		Object o = s;							//Child object can be typecasted to parent.
		System.out.println(o);
	}
	
	public static void main2(String[] args) {
		String s = null;
		System.out.println(s.length());			//RE: java.lang.NullPointerException:
	}
	
	public static void main1(String[] args) {
		int [ ] arr = new int [ 4 ];
		System.out.println(arr[0]);
		System.out.println(arr[10]);			//RE: ArrayIndexOutOfBoundsException:
//		System.out.println(arr[-10]);
		
	}
}