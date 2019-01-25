package Week_1_Wednesday;

import java.util.Scanner;

public class IfElse_Lab {
	// 0 - 60 C
	// 61 - 80 B
	// 81 - 100 A
	// below 0 invalid
	public static void main(String[] args) {
		// Declare variables.
		int score;
		
		// Create a scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input and assign to variable score.
		System.out.print("Enter your score: ");
		score = input.nextInt();
		
		// Call function getGrade.
		getGrade(score);
		
		// Close scanner.
		input.close();	
	}
	
	// Create function getGrade.
	public static void getGrade(int score) {
		/* I like the way you did it better, with invalid conditions handled first. But I didn't
		 * want to copy your work. */
		if (score < 0)
			System.out.println("Invalid score!");
		else if (score >= 0 && score <= 60)
			System.out.println("You earned a C.");
		else if (score >= 61 && score <= 80)
			System.out.println("You earned a B.");
		else if (score >= 81 && score <= 100)
			System.out.println("You earned an A. Great job!");
		else
			System.out.println("Invalid score!");
	}
}
