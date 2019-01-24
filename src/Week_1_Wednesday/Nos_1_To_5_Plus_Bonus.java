package Week_1_Wednesday;

import java.util.ArrayList;
import java.util.List;

public class Nos_1_To_5_Plus_Bonus {
	public static void main(String[] args) {
		// 1. Display the sum of all numbers from 1 to 10.
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
		// 2. Display the sum of all numbers from 1 to 20 that are divisible by 5.
		int sum2 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0)
				sum2 += i;
		}
		System.out.println(sum2);
		
		
		// 3. Display the sum of all even numbers from 10 to 20.
		int sum3 = 0;
		for (int i = 10; i <= 20; i+=2) {
			sum3 += i;
		}
		System.out.println(sum3);
		
		
		// 4. Display the average of numbers from 5 to 10.
		double sum4 = 0;
		double divisor = 0;
		double avg = 0;
		for (int i = 5; i <= 10; i++) {
			sum4 += i;
			divisor += 1;
		}
		avg = sum4 / divisor;
		System.out.println(avg);
		
		
		// 5. Display all the numbers from 5 to 10 that are greater than the average calculated in No. 4, above.
		for (int i = 5; i <= 10; i++) {
			if (i > avg)
				System.out.print(i + " ");
		}
		System.out.println();
		
		
		// Bonus: Display all prime numbers from 2 to 30.
		List<Integer> primeNums = new ArrayList<Integer>();
		
		for (int i = 2; i <= 30; i++) {
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break; 
				}
			}
			
			if (isPrime)
				primeNums.add(i);
		}
		
		for (int num : primeNums) {
			System.out.print(num + " ");
		}
	}
}
