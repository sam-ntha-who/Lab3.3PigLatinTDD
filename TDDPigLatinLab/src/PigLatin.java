public class PigLatin {

	public static void main(String[] args) {

		String toPigLatin = PigLatinPrompt.userInput();
		sortAndPrint(toPigLatin);

	}

	public static String sortAndPrint(String toPigLatin) {
		System.out.println("Your word is: " + toPigLatin);
	
		if (toPigLatin.matches(".*\\s.*")) {
			
			// runs through phrase method then translator method
			toPigLatin = phrase(toPigLatin);
			System.out.println("In Pig Latin, that translates to: " + toPigLatin);
			
		// might get rid of this bit	
		} else if (!toPigLatin.contains(toPigLatin)) {
			System.out.println("Your phrase contains special characters: " + toPigLatin);
			// regular degular translator
		} else
			System.out.println("In Pig Latin, that translates to: " + translate(toPigLatin));
		return toPigLatin;
	}

	public static Boolean isVowel(char c) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		String word = String.valueOf(c);
		String vowelsOnly = new String(vowels);
		return vowelsOnly.contains(word);
	}
//	// this aint right, fix it or get rid of it!
//	public static Boolean isSpecialChar(char c) {
//		char[] specialChar = { '@', '#', '$', '%', '^', '&', '*', '~', '+', '-', '=', '<', '>', '"','`', ':', ';'};
//		String word = String.valueOf(c);
//		String specialCharOnly = new String(specialChar);
//		return word.contains(specialCharOnly);
//	}

	public static String translate(String toPigLatin) {
		// pig latin rules, take leading consonants from the beginning of a word
		// move them to the end of the word, then add suffix -ay. Y is a consonant here
		// if the word starts with a vowel, just end word with suffix -way

		char[] word = toPigLatin.toCharArray();
		String firstSub;
		String lastSub;
	// not working as expected might get rid of it!	
	 if (isVowel(word[0]) == true) {
			toPigLatin += "way";
	
		} else {
			
			// move thru consonants
			int index = 0;
			for (int i = 0; i <= toPigLatin.length(); i++) {

				if (isVowel(toPigLatin.toCharArray()[i]) == true) {
					index = i;
					break;
				}
			}
			firstSub = toPigLatin.substring(index);
			lastSub = toPigLatin.substring(0, index);
			toPigLatin = firstSub + lastSub + "ay";

		}

		return toPigLatin;
	}

	public static String phrase(String toPigLatin) {

		String[] multiWord = toPigLatin.split(" ");
		String output = "";

		for (int i = 0; i < multiWord.length; i++) {
			output += translate(multiWord[i]) + " ";

		}
		output = output.trim();
		return output;

	}


}

