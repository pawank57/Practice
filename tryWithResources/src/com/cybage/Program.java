package com.cybage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	//1.7V
	public static void main(String[] args) {
		// Try with resource(By using try with resource, resources will be closed
		// automatically
		// and we do not need to write finally block.
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			// code
		} catch (Exception e) {
			// Handling Code
		}
	}

	//1.6V
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