package Week_1_Thursday;

public class Nos_1_To_5 {

	public static void main(String[] args) {
		// 1. Write a program to convert every even position toLowerCase and every odd position toUpperCase.
		String word1 = "incredible";
		String letter = "";
		char word1Array[] = word1.toCharArray();
		for (int i = 0; i < word1Array.length; i++) {
			letter = String.valueOf(word1Array[i]);
			if (i % 2 == 0) 
				System.out.print(letter.toLowerCase());
			else 
				System.out.print(letter.toUpperCase());
		}
		System.out.println();
		
		// 2. Write a program to determine if a string is a palindrome.
		String word2 = "racecar";
		String word2Reversed = "";
		for (int i = word2.length() - 1; i >= 0; i--) 
			word2Reversed += word2.charAt(i);
		
		if (word2.equalsIgnoreCase(word2Reversed)) 
			System.out.println("The word is a palindrome.");	
		else 
			System.out.println("The word is not a palindrome.");
		
		// 3. Write a program to count all the vowels in a string.
		String word3 = "excellent";
		word3 = word3.toLowerCase();
		int count = 0;
		char temp;
		for (int i = 0; i < word3.length(); i++) {
			temp = word3.charAt(i);
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
				count++;
		}
		System.out.println("There are " + count + " vowels in " + word3 + ".");
		
		// 4. Write a program to remove a given character from a string.
		String word4 = "fantasTic";
		word4 = word4.toLowerCase();
		String word4New = word4.replace("t", "");
		System.out.println(word4New);
		
		// 5. Write a program to remove the middle character of a string.
		String word5 = "amazing";
		int midBeginning; // where the middle starts
		int midLength; // how long the middle is (1 or 2)
		if (word5.length() % 2 == 0) {
			midBeginning = (word5.length() / 2) - 1;
			midLength = 2;
		}
		else {
			midBeginning = word5.length() / 2; // 
			midLength = 1;
		}
		System.out.println(word5.substring(midBeginning, midBeginning + midLength)); // *******  (incl beg, excl/ends before end)
	}
}
