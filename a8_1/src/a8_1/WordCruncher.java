package a8_1;

public class WordCruncher {
	String word;
	
	public WordCruncher() {
		word = "default";
	}
	
	public WordCruncher(String str) {
		if (checkString(str))
			word = str;
		else if (!checkString(str))
			word = "default";
	}
	
	//returns the instance variable "word"
	public String toString() {
		return word;
	}
	
	//returns number of letters in the instance variable "word"
	public int numLetters() {
		return word.length();
	}
	
	//returns number of vowels in the instance variable "word"
	public int numVowels() {
		int num = 0;
		String str = word.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				num ++;
		}
		return num;
	}
	
	//returns true if the first letter of the instance variable "word" is a vowel
	public boolean beginsWithVowel() {
		boolean result = false;
		String str = word.toLowerCase();
		if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u')
			result = true;
		return result;
	}
	
	//returns a new string, translated from the instance variable "word" into "pig latin"
	public String toPigLatin() {
		String result = "";
		if (!beginsWithVowel()) {
			for (int i = 1; i < word.length(); i++)
				result += word.charAt(i);
			result += word.charAt(0) + "ay";
		}
		else if (beginsWithVowel())
			result = word + "way";
		return result;
	}
	
	//returns a new string, translated from the instance variable "word" into "gibberish"
	public String toGibberish() {
		String result = "";
		if (!beginsWithVowel()) {
			result += word.charAt(0) + "ithag";
			for (int i = 1; i < word.length(); i++)
				result += word.charAt(i);
		}
		else if (beginsWithVowel())
			result = "ithag" + word;
		return result;
	}
	
	//returns a string that contains the characters of the instance variable in reverse
	public String reverse() {
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--)
			result += word.charAt(i);
		return result;
	}
	
	//returns the number of times char ch occurs in the instance variable
	public int numCharOccurrences(char ch) {
		int result = 0;
		String str = word.toLowerCase();
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == ch)
				result++;
		}
		return result;
	}
	
	//checks if the string consists of anything other than letters
	public boolean checkString(String str) {
		boolean result = false;
	      str = str.toLowerCase();
	      for (int i = 0; i < str.length(); i++) {
	         if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	            result = true;
	         }
	      }
	      return result;
	   }
}
