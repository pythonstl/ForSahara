package Week_1_Tuesday;

import java.util.Scanner;

public class No_4_Rounding {
	public static void main(String[] args) {
		// CONVERT A NUMBER TO A WHOLE NUMBER.
		
		// Declare variables.
		double dNum = 0;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Prompt user for input.
		System.out.print("Enter a number as a double: ");
		dNum = in.nextDouble();
		
		// Call function returnInt.
		returnInt(dNum);
		
		// Close the scanner.
		in.close();
	}
	
	// Create function returnInt.
	public static void returnInt(double dNum) {
		// Round the number with Math.
		double rounded = Math.round(dNum);
		
		// Cast the double to int.
		int whole = (int)rounded;
		
		// Print results.
		System.out.println(whole);
	}
}
