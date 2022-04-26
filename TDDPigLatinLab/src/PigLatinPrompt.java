import java.util.Scanner;

public class PigLatinPrompt {

	public static String userInput() {
		System.out.println("Please enter a word you would like translated into Pig Latin:");
		Scanner scnr = new Scanner(System.in);
		String userInput = scnr.nextLine();
		return userInput;
	
	}

}
