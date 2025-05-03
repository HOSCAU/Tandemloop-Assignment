package Testtandemloop;

import java.util.Scanner;

public class OddnumberSeries {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = scanner.nextInt();
		scanner.close();
		
		if (a <= 0) {
			System.out.println("Input should be a positive integer.");
			return; // Added return to handle non-positive input
			
		}
		
		System.out.println("Output: ");
		for (int i = 1; i <= (2 * a - 1); i += 2) {
			System.out.print(i);
			if (i < (2 * a - 1)) { //Added a check to prevent printing
				System.out.print(", ");
			}
		}
		System.out.println(); // Add a newline for better formatting
	}

}
