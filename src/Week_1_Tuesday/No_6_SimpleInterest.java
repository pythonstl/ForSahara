package Week_1_Tuesday;

import java.text.NumberFormat;
import java.util.Scanner;

public class No_6_SimpleInterest {
	public static void main(String[] args) {
		// CALCULATE THE SIMPLE INTEREST AFTER A SPECIFIED # OF YEARS.
		
		// Declare variables.
		double principal, intRate, years;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Get principal from user.
		System.out.print("Enter an investment amount: ");
		principal = in.nextDouble();
		
		// Get interest rate from user.
		System.out.print("Enter an interest rate: ");
		intRate = in.nextDouble();
		
		// (Here, convert to 100th place.)
		intRate = intRate * 0.01;
		
		// Get number of years from user.
		System.out.print("Enter the number of years: ");
		years = in.nextDouble();
		
		// Call function getSimpleInterest.
		getSimpleInterest(principal, intRate, years);
		
		// Close the scanner.
		in.close();
	}

	// Create function getSimpleInterest.
	// simple interest formula: A = P * (1 + (i * y))
	public static void getSimpleInterest(double principal, double intRate, double years) {
		// Calculate total and profit.
		double total = principal * (1 + (intRate * years));
		double profit = total - principal;
		
		// Create a formatter.
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		// Print results.
		System.out.println("Total : " + formatter.format(total));	
		System.out.println("Total profit: " + formatter.format(profit));
	}
}
