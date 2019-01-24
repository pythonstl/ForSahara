package Week_1_Tuesday;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No_5_BMI {

	public static void main(String[] args) {
		// CALCULATE A USER'S BMI.
		
		// Declare variables.
		double height, weight;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Prompt user for height and weight.
		System.out.print("Enter your height in inches: ");
		height = in.nextDouble();
		
		System.out.print("Enter your weight in lbs.: ");
		weight = in.nextDouble();
		
		// Call function getBMI.
		getBMI(height, weight);
		
		// Close scanner.
		in.close();
	}

	// Create function getBMI.
	// BMI = (703 * weight) / (height * weight) if Imperial
	public static void getBMI(double height, double weight) {
		// Calculate BMI.
		double bmi = (703 * weight) / (height * height);
		
		// Create formatter to format decimal places.
		DecimalFormat dFormatter = new DecimalFormat("##.00");
		
		// Print results.
		System.out.println("Your BMI is " + dFormatter.format(bmi) + ".");
	}
}
