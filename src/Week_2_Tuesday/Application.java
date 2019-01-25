package Week_2_Tuesday;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Create a scanner.
		Scanner input = new Scanner(System.in);
		
		// 1. Write a method to create a box, calculate its volume, and calculate its cost per inch^2.
		Box box1 = new Box();
		fillBox(box1, input);
		
		box1.calcSurf();
		box1.calcVol();
		box1.calcCost();
		
		// 2. Create an object that has three pieces of information as instance variables.
		Date date1 = new Date(12, 14, 1989);
		date1.displayDate();
		
		// Close scanner.
		input.close();
	}

	// Sets values of Box object in No. 1, above.
	static Box fillBox(Box box, Scanner input) {
		System.out.print("Enter the height: ");
		box.setHeight(input.nextDouble());
		System.out.print("Enter the length: ");
		box.setLength(input.nextDouble());
		System.out.print("Enter the depth: ");
		box.setDepth(input.nextDouble());
		System.out.print("Enter the cost per inch2: ");
		box.setCostSq(input.nextDouble());
		System.out.println();
		return box;
	}
}
