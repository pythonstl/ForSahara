package Week_1_Tuesday;

import java.util.Scanner;

public class No_1_Circumference {
	public static void main(String[] args) {
		/*	1.Write a program to prompt the user to enter the radius of the circle
			then calculate the area and circumference of the circle. 
			A = pi * r2
			circumference = 2 * pi * r
		 */
		
		// Define variables below.
		// Use Math class to get value of pi.
		double pi = Math.PI;
		// Create empty radius for now.
		double radius = 0;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Prompt for radius.
		System.out.print("Enter a radius: ");
		radius = in.nextDouble();
		
		// Call functions.
		getArea(radius, pi);
		getCircumference(radius, pi);
		
		// Close the scanner.
		in.close();
	}
	
	
	// Create function getArea.
	public static void getArea(double radius, double pi) {
		// Calculate area.
		// A = pi * (r**r)
		double area = pi * (radius * radius);
		
		// Print results.
		System.out.println("The area is " + area + ".");
	}
	
	// Create function getCircumference.
	public static void getCircumference(double radius, double pi) {
		// Calculate circumference.
		// C = 2 * pi * r
		double circumference = 2 * pi * radius;
		
		// Print results.
		System.out.println("The circumference is " + circumference + ".");
	}
}
