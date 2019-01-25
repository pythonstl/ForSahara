package Week_1_Thursday;

import java.util.Scanner;

public class Lab_StringEvenCharacters {
	public static void main(String[] args) {
		// Define variables.
		String word = " ";
		
		// Create a scanner.
		Scanner input = new Scanner(System.in);
		
		// Get word from user.
		System.out.print("Enter a word: ");
		word = input.next();
		
		// Loop through letters in string and print letters at even positions.
		for (int i = 0; i < word.length(); i +=2 ) 
			System.out.print(word.charAt(i) + " ");
		
		// Close scanner.
		input.close();	
	}
}
