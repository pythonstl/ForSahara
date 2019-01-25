package Week_1_Wednesday;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers_Lab {
	public static void main(String[] args) {
		// Create empty myArrayList. Use for-loop below to assign numbers to it.
		List<Integer> myArrayList = new ArrayList<Integer>();
		
		// Create for-loop to add each number in given range (2 to 30) to myArrayList.
		for (int i = 2; i <= 30; i++) {
			myArrayList.add(i);
		}
		
		// Go through each number in myArrayList and print if isPrime == true.
		for (int num : myArrayList) {
			
			// isPrime gets reset for each num in myArrayList.
			boolean isPrime = true; 
			
			// 2 never gets divided by 2, since 2 < 2 != true
			for (int divisor = 2; divisor < num; divisor++) {  
				if (num % divisor == 0) {
					isPrime = false;
					break; // Break out of the inner for-loop.
				}
			}
			
			if (isPrime == true)
				System.out.print(num + " ");
			else
				continue;
		}
	}
}
