package com.cybage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * The main advantage of try with resource is , we are not required to write finally block 
 * explicitely bcoz we are not required to close resources explicitely.
 */
public class Program {
	/** Try with multiple resoures */
	public static void main3(String[] args) {
		try (FileWriter fw = new FileWriter("output.txt"); 
		FileReader fr = new FileReader("input.txt")) {
			
		} catch (Exception e) {

		}
	}

	// 1.7V
	/**
	 * Try with resource(By using try with resource, resources will be closed
	 * automatically and we do not need to write finally block.
	 */
	public static void main2(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			// code
		} catch (Exception e) {
			// Handling Code
		}
	}

	// 1.6V
	/**
	 * Try catch with finally
	 */
	public static void main1(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}