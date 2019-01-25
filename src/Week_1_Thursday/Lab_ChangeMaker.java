package Week_1_Thursday;

import java.util.Scanner;

public class Lab_ChangeMaker {
	public static void main(String[] args) {
		// Declare variables.
		double centsGiven;
		
		// Create a scanner.
		Scanner input = new Scanner(System.in);
		
		// Collect input from user.
		System.out.print("How much change do you have? ");
		
		centsGiven = input.nextDouble();	
		
		// Get quarters.
		centsGiven = getQuarters(centsGiven);
		
		// Get dimes.
		centsGiven = getDimes(centsGiven);
		
		// Get nickels.
		centsGiven = getNickels(centsGiven);
		
		// Get pennies.
		centsGiven = getPennies(centsGiven);
		
		input.close();
	}
	
	public static double getQuarters(double centsGiven) {
		double change = centsGiven % 25;
		double quarters = (centsGiven - change)/25;
		System.out.println((int)quarters + " quarters");
		return change;		
	}
	
	public static double getDimes(double centsGiven) {
		double change = centsGiven % 10;
		double dimes = (centsGiven - change)/10;
		System.out.println((int)dimes + " dimes");
		return change;		
	}
	
	public static double getNickels(double centsGiven) {
		double change = centsGiven % 5;
		double nickels = (centsGiven - change)/5;
		System.out.println((int)nickels + " nickels");
		return change;		
	}
	
	public static double getPennies(double centsGiven) {
		double change = centsGiven % 1;
		double pennies = (centsGiven - change)/1;
		System.out.println((int)pennies + " pennies");
		return change;		
	}
}
