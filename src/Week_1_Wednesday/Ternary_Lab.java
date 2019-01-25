package Week_1_Wednesday;

import java.util.Scanner;

public class Ternary_Lab {
	public static void main(String[] args) {
		// Declare variables.
		int num1, num2;
		char operator;
		
		// Create a scanner.
		Scanner input = new Scanner(System.in);
		
		// Get two numbers from the user.
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		System.out.print("Enter another number: ");
		num2 = input.nextInt();
		
		// Force the user to provide +, *, or -. Loop until valid input provided.
		do {
			System.out.print("Enter a ternary operator: ");
			operator = input.next().charAt(0);
		} while ((operator != '+') && (operator != '*') && (operator != '-'));
		
		// Print the result by calling calcResult.
		calcResult(num1, num2, operator);
		
		// Close the scanner.
		input.close();
	}
	
	/**
	 * Create function calcResult.
	 * Provides result of two numbers using given operator.
	 * @param num1
	 * @param num2
	 * @param operator
	 */
	public static void calcResult(int num1, int num2, char operator) {
		// Set int result to 0 for now.
		int result = 0;
		
		// Calculate result based on provided operator.
		switch (operator) {
			case '+': result = num1 + num2;
			break;
			case '*': result = num1 * num2;
			break;
			case '-': result = num1 - num2;
			break;
			default:
			break;
		}
		
		// Print the result.
		System.out.println(result);
	}
}
