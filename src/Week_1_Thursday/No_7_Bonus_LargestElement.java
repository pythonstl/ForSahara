package Week_1_Thursday;

import java.util.Arrays;

public class No_7_Bonus_LargestElement {

	public static void main(String[] args) {
		// *Bonus Question 7*: Write a program to find the largest element of an integer array.
		int[] intArray = new int[] {8, 7, 3, 9, 5};
		Arrays.sort(intArray);
		System.out.println("The largest number in the array is " + intArray[intArray.length - 1] + ".");
	}

}
