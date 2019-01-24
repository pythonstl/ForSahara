package Week_1_Tuesday;

import java.util.Scanner;

public class No_2_AreaTriangle {

	public static void main(String[] args) {
		// CALCULATE THE AREA OF A TRIANGLE.
		
		// Declare variables.
		double width, height;
		
		// Create a scanner.
		Scanner in = new Scanner(System.in);
		
		// Prompt user for width & height.
		System.out.print("Enter a base-width: ");
		width = in.nextDouble();
		
		System.out.print("Enter a base-height: ");
		height = in.nextDouble();

		// Call the function getArea.
		getArea(width, height);
		
		// Close the scanner.
		in.close();
	}
	
	// Create function getArea.
	public static void getArea(double width, double height) {
		// Calculate area. 
		// A = 1/2(w * h)
		double area = 0.5 * (width * height);
		
		// Print results.
		System.out.println("The area of the triangle is " + area + ".");
	}
}
