import java.util.Arrays;
import java.util.Scanner;

public class UniqueChars {

	public static void main(String[] args) {

		System.out.println("Type a string, and we'll check if it has all unique characters! Type 'exit'"
				+ " to quit the program.\n(Exit has all unique characters)");

		while (true) {
			Scanner input = new Scanner(System.in);
			String toPrint = input.nextLine();
			String checkIfUnique = toPrint.toLowerCase();

			if (checkIfUnique.equals("exit")) {
				System.out.println("Bye!");
				input.close();
				System.exit(0);
			}

			char[] newArray = checkIfUnique.toCharArray();
			Arrays.sort(newArray);
			if (isUnique(newArray) == true)
				System.out.println("\"" + toPrint + "\" has all unique characters!");
			else
				System.err.println("\"" + toPrint + "\" does not have unique characters.");

		}
	}

	private static boolean isUnique(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				return false; // safe because so far all is unique
			}
		}
		return true;
	}
}
