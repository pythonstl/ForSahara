package Week_1_Thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class No_6_Bonus_AllUnique {

	public static void main(String[] args) {
		// *Bonus Question 6*: Write a program to read an input and determine if a string has all unique characters.
		System.out.print("Enter a word: ");
		Scanner input = new Scanner(System.in);
		String palabra = input.next().toUpperCase();
		input.close();
		char[] charArray = palabra.toCharArray();
		Arrays.sort(charArray);
		
		ArrayList<Character> dupLetters = new ArrayList<Character>();
		
		// Set a default boolean.
		boolean isUnique = true;
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			// If last index, break the loop.
			if (i == charArray.length - 1)
				break;
			// Compare charArray[i] to charArray[i + 1].
			if (charArray[i] == charArray[i + 1]) {
				isUnique = false;
				dupLetters.add(charArray[i]);
				count++;
				break;
			}
		}
		
		if (isUnique == true) 
			System.out.println("All letters in " + palabra + " are unique.");
		else 
			System.out.println("There are duplicate letters in " + palabra + ".");
	}
}
