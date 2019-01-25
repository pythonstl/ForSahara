package Week_1_Wednesday;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers2_Lab {
	public static void main(String[] args) {
		// Declare variables.
		int rangeBegin = 2;
		int rangeEnd = 30;
		
		// Create List primeNumbers by calling function getPrimeNumbers.
		List<Integer> primeNumbers = getPrimeNumbers(rangeBegin, rangeEnd);
		
		// Print every number in list of prime numbers.
		for (int num : primeNumbers)
			System.out.print(num + " ");
	}
	
	/** Create function getPrimeNumbers.
	 * (Returns a List of prime numbers in a given range: rangeBegin to rangeEnd.)
	 * @param rangeBegin
	 * @param rangeEnd
	 * @return List<Integer> tempList
	 */
	public static List<Integer> getPrimeNumbers(int rangeBegin, int rangeEnd) {
		// Create something in which to store prime numbers.
		List<Integer> tempList = new ArrayList<>();
		
		// For every iteration from rangeBegin up to (and including) rangeEnd [...]
		for (int i = rangeBegin; i <= rangeEnd; i++) {
		
			// [...] create a fresh boolean, isPrime, and set it to true, by default [...]
			boolean isPrime = true;
			
			// [...] and then loop through every number (j) leading up to, but not including, i.
			for (int j = rangeBegin; j < i; j++) {
				
				// If i divided (%) by any iteration of j leaves a remainder of 0 [...]
				if (i % j == 0) {
					
					// [...] then i is not a prime number, so set the value of isPrime to false and break out of the inner for-loop.
					isPrime = false;
					break;
				}
			}
			
			// If i was divided (%) by every iteration of j and never left a remainder [...]
			if (isPrime) {
				
				// [...] then add i to the list of prime numbers.
				tempList.add(i);
			}
		}
		
		// Send the list of prime numbers back to main().
		return tempList;
	}
}
