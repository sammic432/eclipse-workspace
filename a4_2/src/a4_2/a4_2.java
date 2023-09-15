// Sammi Chen, Feb 16, 2021 CS 111B instructor: Dave Harden

// a4_2 this program prompts a user to input the amount of numbers they want to input (lines 21-23), and checks the placement
// of 7 in those numbers that were input. The program checks the first and last 7s out of those numbers using a 'while' loop 
// and saves it as a variable in an 'if' statement in lines 28-32. Lines 36-42 show the program checking to see if any 7s
// were entered, if there weren't there would be a message indicating to the user that there were no 7s, and if there were then
// the program would print out the positions of the first and last 7s. Lines 47-82 show how the program runs accordingly, and 
// matches the example


package a4_2;
import java.util.Scanner;

public class a4_2 {
	public static void main(String[] args) {
		int count = 1;
		final int SEVEN = 7;
		int firstPosition = 0;
		int lastPosition = 0;

		java.util.Scanner in = new Scanner(System.in);
		System.out.print("How many numbers will be entered? ");
		int numCount = in.nextInt();
		
		while(count < numCount + 1) {
			System.out.print("Enter num: ");
			int num = in.nextInt();
			if (num == SEVEN) {
				if (firstPosition == 0)
					firstPosition = count;
				lastPosition = count;
			}
			count ++;
		}
		
		if (firstPosition != 0 || lastPosition != 0) {
			System.out.println("The first 7 was in position " + firstPosition);
			System.out.println("The last 7 was in position " + lastPosition);
		}
		else if (firstPosition == 0 || lastPosition == 0) {
			System.out.print("Sorry, no 7's were entered.");
		}
		
		in.close();
	}
}
	/*
	 * How many numbers will be entered? 8
	 * Enter num: 5
	 * Enter num: 7
	 * Enter num: 6
	 * Enter num: 7
	 * Enter num: 7
	 * Enter num: 3
	 * Enter num: 8
	 * Enter num: 6
	 * The first 7 was in position 2
	 * The last 7 was in position 5
	 * 
	 * How many numbers will be entered? 8
	 * Enter num: 5
	 * Enter num: 2
	 * Enter num: 6
	 * Enter num: 7
	 * Enter num: 1
	 * Enter num: 3
	 * Enter num: 8
	 * Enter num: 6
	 * The first 7 was in position 4
	 * The last 7 was in position 4
	 * 
	 * How many numbers will be entered? 8
	 * Enter num: 5
	 * Enter num: 1
	 * Enter num: 6
	 * Enter num: 5
	 * Enter num: 9
	 * Enter num: 3
	 * Enter num: 8
	 * Enter num: 6
	 * Sorry, no 7's were entered.
	 */

