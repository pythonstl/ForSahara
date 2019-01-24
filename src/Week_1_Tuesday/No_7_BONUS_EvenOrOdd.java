package Week_1_Tuesday;

import java.util.Scanner;

public class No_7_BONUS_EvenOrOdd {
	public static void main(String[] args) {
		// DETERMINE IF A NUMBER IS EVEN OR ODD.
		
		// Declare variables.
		int input;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Prompt user for input.
		System.out.print("Enter a number: ");
		
		input = in.nextInt();
		
		// Call function getEvenOrOdd.
		getEvenOrOdd(input);
		
		// Close scanner.
		in.close();
	}
	
	// Create function getEvenOrOdd.
	public static void getEvenOrOdd(int input) {
		if (input % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
	}
}
