import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class StringProblems {

	private static String reverseString(String toReverse) {
		// hello
		// olleh

		char[] reversed = toReverse.toCharArray();
		int endIndex = reversed.length - 1, startIndex = 0;
		char temp;

		while (endIndex > startIndex) {
			temp = reversed[startIndex];
			reversed[startIndex] = reversed[endIndex];
			reversed[endIndex] = temp;
			endIndex--;
			startIndex++;
		}
		return new String(reversed);
	}

	private static HashMap<String, Integer> changeMaking(int changeValue) {
		int quarterCount = 0, dimeCount = 0;
		int nickelCount = 0, pennyCount = 0;

		HashMap<String, Integer> amountPerDenomination = new HashMap<>();

		if (changeValue < 0) { // If change is presented as a negative amount
			System.err.println("No solution");
		}

		while (changeValue > 0) {

			if (changeValue >= 25) {
				quarterCount++;
				changeValue -= 25;
				amountPerDenomination.put("Quarters", quarterCount);
			} else if (changeValue >= 10) {
				dimeCount++;
				changeValue -= 10;
				amountPerDenomination.put("Dimes", dimeCount);
			} else if (changeValue >= 5) {
				nickelCount++;
				changeValue -= 5;
				amountPerDenomination.put("Nickels", nickelCount);
			} else if (changeValue >= 1) {
				pennyCount++;
				changeValue -= 1;
				amountPerDenomination.put("Pennies", pennyCount);
			}
		}

		return amountPerDenomination;
	}

	public static void main(String[] args) {
		System.out.println("Hello. Please type a value to make change");
		Scanner input = new Scanner(System.in);

		if (input.nextLine().toString().trim().toLowerCase().equals("exit")) {
			System.out.println("Goodbye!");
			System.exit(1);
		}

		try {
			while (true) {
				int change = Integer.parseInt(input.nextLine());
				System.out.println("The inputted change value is " + change);
				System.out.println("These are its breakdowns:\t" + changeMaking(change));

			}
		} catch (Exception didNotTypeString) {
			System.err.println("Error");
		}
		//input.close();
	}

}
