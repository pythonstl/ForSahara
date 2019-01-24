package Week_1_Friday;

public class Week_1_Friday {

	public static void main(String[] args) {
		/* 1. Write program that generates following output:
		 *		*****
		 * 		*****
		 * 		*****
		 * */
		 
		for (int i = 0 ; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 2. Write program that generates following output:
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 */
		for (int i = 0; i < 4; i++) {
			printAngle(i, "*");
		}
		System.out.println();
		
		/* 3. Write a program that generates following output:
		 * 		*****
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		for (int L = 4; L >= 0; L--) {
			printAngle(L, "*");
		}
		System.out.println();
		
		/* 4. Write a program that generates following output:
		 * 		12345
		 * 		12345
		 * 		12345
		 * 		12345
		 * 		12345
		 */
		for (int m = 0; m < 5; m++) {
			for (int n = 0; n < 5; n++) {
				System.out.print(n + 1);
			}
			System.out.println();
		}
		System.out.println();
		
		/* 5. Write a program that generates following output:
		 * 		1111
		 * 		2222
		 * 		3333
		 */
		for (int p = 0; p < 3; p++) {
			for (int r = 0; r < 4; r++) {
				System.out.print(p + 1);
			}
			System.out.println();
		}
		System.out.println();
		
		/* 5. Write a program that generates following output: (ALTERNATIVE)
		 * 		1111
		 * 		2222
		 * 		3333
		 */
		for (int p = 0; p < 3; p++) {
			for (int q = 0; q < 4; q++) {
				//printBox();
			}
		}
		System.out.println();
		
		
		/* 6. Write a program that generates following output:
		 * 		1
		 * 		22
		 * 		333
		 * 		4444
		 */
		for (int s = 0; s < 4; s++) {
			printAngle(s, String.valueOf(s + 1));
		}
		System.out.println();
	}
	
	// RE-USABLE METHODS:
	
	/**
	public static void printStar(int numOfRows) {
		int counter = 0;
		while (numOfRows >= 0) {
			System.out.print("*");
			counter++;
		}
		System.out.println();
	} **/
	
	// I realized that the version above does the exact same thing, except instead of bringing int counter UP,
	// this function brings int numOfRows DOWN, to accomplish the same thing.
	// I modified it again to take a re-usable string parameter.
	public static void printAngle(int numOfRows, String printMe) {
		while (numOfRows >= 0) {
			System.out.print(printMe);
			numOfRows--;
		}
		System.out.println();
	}
	
	public static void printBox(int numOfRows, int numOfCols, String printMe) {
		for (int p = 0; p < numOfRows; p++) {
			while (numOfCols >= 0) {
				System.out.print("");
			}
		}
	}
}
