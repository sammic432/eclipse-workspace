package a8_1;
import java.util.Scanner;

public class WordCruncherTest {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word('quit' to quit): ");
		String input = in.next();
		
		if (input.equals("quit"))
			System.exit(0);
		while (!(input.equals("quit"))) {
			WordCruncher word = new WordCruncher(input);
			
			//1. outputs the number of letters in this object
			int nLetters = word.numLetters();
			System.out.println("Number of letters: " + nLetters);
			
			//2. outputs the number of vowels in this object
			int nVowels = word.numVowels();
			System.out.println("Number of vowels: " + nVowels);
			
			//3. outputs the object string in reverse
			String backward = word.reverse();
			System.out.println("String in reverse: " + backward);
			
			//4. outputs the pig latin translation of the string stored in the object
			String pig = word.toPigLatin();
			System.out.println("String in Pig Latin: " + pig);
			
			//5. outputs the gibberish translation of the string stored in the object
			String gibberish = word.toGibberish();
			System.out.println("String in gibberish: " + gibberish);
			
			//6. asks the user to enter one letter, returns number of occurrences of the letter in the word
			System.out.print("Enter a char: ");
			char letter = in.next().charAt(0);
			int charAmount = word.numCharOccurrences(letter);
			System.out.println(letter + " is found in the word " + charAmount + " times.");
			
			System.out.print("Enter a word('quit' to quit): ");
			input = in.next();
		}
		in.close();
	}
	
}

//Enter a word('quit' to quit): weeknd
//Number of letters: 6
//Number of vowels: 2
//String in reverse: dnkeew
//String in Pig Latin: eekndway
//String in gibberish: withageeknd
//Enter a char: n
//n is found in the word 1 times.
//Enter a word('quit' to quit): iphone
//Number of letters: 6
//Number of vowels: 3
//String in reverse: enohpi
//String in Pig Latin: iphoneway
//String in gibberish: ithagiphone
//Enter a char: u
//u is found in the word 0 times.
//Enter a word('quit' to quit): quit
