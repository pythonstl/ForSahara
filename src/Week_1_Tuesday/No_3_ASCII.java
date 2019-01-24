package Week_1_Tuesday;

import java.util.Scanner;

public class No_3_ASCII {
	public static void main(String[] args) {
		// FIND ASCII/NUMERIC VALUE OF A GIVEN LETTER OF THE ALPHABET.
		
		// Declare variables.
		char letter;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Get input from the user.
		System.out.print("Enter a letter: ");
		
		letter = in.next().charAt(0);
		
		// Call function getNumValue
		getNumValue(letter);
		
		// Close the scanner.
		in.close();
	}
	
	// Create function getNumValue.
	public static void getNumValue(char letter) {
		// Assign letter to int ASCII via casting.
		int ascii = (int)(letter);
		
		// Print results.
		System.out.println("The ASCII value is " + ascii + ".");
	}
}
