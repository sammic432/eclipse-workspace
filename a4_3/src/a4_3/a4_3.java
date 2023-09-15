// Sammi Chen, Feb 16, 2021 CS 111B instructor: Dave Harden

// a4_3 The objective of this program is to continuously get the user to input an integer n and find the sum of the square 
// of numbers between 0 and n. The program asks for the user to enter the number (lines 16-18) and uses the method findSum
// in lines 29-36. findSum takes the number input and counts backwards by using a loop to add the square value of the number
// to a variable and then subtracting 1 from the number and stopping when it reaches 0. The variable, which is the total sum,
// is then returned and printed in the while loop in lines 19-25. This while loop prints out the sum of each number the user
// inputs and prompts for the next number, and continues to do that until the user enters a number less than 1. When this 
// happens, the program runs an if statement to stop the program (lines 23-24). Lines 38-44 show that the program runs as
// required according to the example provided in the assignment.
package a4_3;
import java.util.Scanner;

public class a4_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number greater than 0 (less than 1 to quit): ");
		int num = in.nextInt();
		while (num > 0) {
			System.out.println("The sum of the squares from 1 to " + num + " is " + findSum(num));
			System.out.print("Enter a number greater than 0 (less than 1 to quit): ");
			num = in.nextInt();
			if (num <= 0)
				System.exit(0);
		}
		in.close();
	}
	
	public static int findSum(int number) {
		int total = 0;
		while (number > 0) {
			total += number * number;
			number--;
		}
		return total;
	}
}
	/*
	 * Enter a number greater than 0 (less than 1 to quit): 4
	 * The sum of the squares from 1 to 4 is 30
	 * Enter a number greater than 0 (less than 1 to quit): 1
	 * The sum of the squares from 1 to 1 is 1
	 * Enter a number greater than 0 (less than 1 to quit): 0
	 */
