package Week_1_Wednesday;

import java.util.Scanner;

public class GradeLetter_Lab {
	public static void main(String[] args) {
		// Declare variables.
		int score;
		
		// Create a scanner.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input and assign to int grade.
		System.out.print("Enter your score: ");
		score = input.nextInt();
		
		// Call function getGrade(score);
		getGrade(score);
		
		// Close the scanner.
		input.close();
	}
	
	// Create function getGrade.
	public static void getGrade(int score) {
		// Define Strings grade and feedback.
		String grade = "";
		String feedback = "";
		
		// Use score to select a letter grade, since Java doesn't allow ranges in switches.
		if (score >= 0 && score <= 60)
			grade = "C";
		if (score >= 61 && score <= 80)
			grade = "B";
		if (score >= 81 & score <= 100)
			grade = "A";

		// Determine which feedback to give by passing the new value of grade.
		switch (grade) {
			case "A": feedback = "You earned an A.";
			break;
			case "B": feedback = "You earned a B.";
			break;
			case "C": feedback = "You earned a C.";
			break;
			default: feedback = "Invalid entry!";
			break;
		}
		
		// Print the results.
		System.out.println(feedback);	
	}
}
