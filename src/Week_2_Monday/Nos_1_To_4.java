package Week_2_Monday;

public class Nos_1_To_4 {

	public static void main(String[] args) {
		// 1. Print a string a given number of times.
		multiplyString("Hello", 3);
		
		// 2. Print 0 if all unique, 10 if two are equal, and 20 if all equal.
		getLotteryResults(1, 2, 3);
		//getLotteryResults(3, 5, 5);
		//getLotteryResults(5, 5, 7);
		//getLotteryResults(7, 7, 7);
		
		// 3. Count the number of times xx appears.
		countLetters("XXL T-shirt xxxxxxx", 'x');
		
		// 4. Figure out if the squirrels are playing.
		System.out.println(areSquirrelsPlaying(95, false));
	}

	// 1. Above
	public static void multiplyString(String word, int times) {
		while (times > 0) {
			System.out.print(word);
			times--;
		}
		System.out.println();
	}
	
	// 2. Above
	public static void getLotteryResults(int num1, int num2, int num3) {
		if (num1 == num2 && num1 == num3)
			System.out.println(20);
		else if (num1 == num2 ^ num1 == num3 || num2 == num1 ^ num2 == num3)
			System.out.println(10);
		else
			System.out.println(0);
	}
	
	// 3. Above
	public static void countLetters(String word, char letter) {
		word = word.toLowerCase();
		int count = 0;
		
		// Make sure user provided input.
		//if (word.length() == 0) 
		//	System.out.println("This is an empty string.");	
		//else
		//{
			for (int i = 0; i < word.length() - 1; i++) {
				if (word.charAt(i) == letter && word.charAt(i + 1) == letter) {
					count++;
				}
			}
			System.out.println(count);
		//}
	}
	
	// 4. Above
	public static boolean areSquirrelsPlaying(int temperature, boolean summer) {
		// If it's the summer:
		if (summer == true) {
			if (temperature >= 60 && temperature <= 100) 
				return true;
			else
				return false;
		}
		// If it isn't the summer:
		else {
			if (temperature >= 60 && temperature <= 90) 
				return true;
			else
				return false;
		}
	}
}
