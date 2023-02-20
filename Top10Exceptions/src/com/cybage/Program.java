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
 * */

public class Program{
	public static void main(String[] args) {
		int [ ] arr = new int [ 4 ];
		System.out.println(arr[0]);
		System.out.println(arr[10]);
		
	}
}