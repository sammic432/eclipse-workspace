// Sammi Chen, Feb 16, 2021 CS 111B instructor: Dave Harden

// a4_1 This program prompts the user to input multiple ages of people who attended a theater show and ends the program if the
// value is under 0 (lines 36-43). The program then runs a while loop for every positive value the user inputs and finds the 
// oldest and youngest age (lines 44-50) as part of phase 2. Next, the ages were put into the corresponding age categories (lines 52-61)
// and printed out to show the amount of people in each age range that attended (lines 77-81). The variables used for this were initialized 
// in lines 17-25. The program then prompts the user to enter a food preference for each attendee and kept count of each food they 
// chose (lines 63-70), and printed those results in lines 83-85.For phase 2, I created another method to calculate 
// the average age of all the attendees (lines 94-97). Lines 99-126 shows the output of the program to be the same as the example.
// 

package a4_1;
import java.util.Scanner;

public class a4_1 {
	public static void main(String[] args) {
		final int AGE_EIGHTEEN = 18;
		final int AGE_THIRTY = 30;
		final int AGE_FORTY = 40;
		final int AGE_SIXTY = 60;
		int teen = 0;
		int twenties = 0;
		int thirties = 0;
		int forties = 0;
		int senior = 0;
		
		int totalAge = 0;
		int numAges = 0;
		int youngest = 50;
		int oldest = 0;
		
		int popcorn = 0;
		int soda = 0;
		int both = 0;
		
		Scanner in = new Scanner(System.in);
		int age = 0;
		System.out.print("Enter age of attendee (negative number to quit): ");
		age = in.nextInt();
		if (age < 0) {
			System.out.print("no information was given.");
			System.exit(0);
		}
		while (age >= 0) {
			totalAge += age;
			numAges++;
			if (age < youngest)
				youngest = age;
			if (age > oldest)
				oldest = age;
			
			if (age > AGE_SIXTY)
				senior++;
			else if (age > AGE_FORTY)
				forties++;
			else if (age > AGE_THIRTY)
				thirties++;
			else if (age > AGE_EIGHTEEN)
				twenties++;
			else if (age < AGE_EIGHTEEN)
				teen++;
			
			System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: ");
			String food = in.next();
			if (food.equals("p"))
				popcorn++;
			else if (food.equals("s"))
				soda++;
			else if (food.equals("b"))
				both++;
			
			System.out.print("Enter age of attendee (negative number to quit): ");
			age = in.nextInt();
		}
		

		System.out.println("age 0 to 18: " + teen);
		System.out.println("age 19 to 30: " + twenties);
		System.out.println("age 31 to 40: " + thirties);
		System.out.println("age 41 to 60: " + forties);
		System.out.println("over 60: " + senior);
		
		System.out.println("food preference popcorn: " + popcorn);
		System.out.println("food preference soda: " + soda);
		System.out.println("food preference both: " + both);
		
		System.out.printf("The average age was %.1f\n", findAverage(totalAge, numAges));
		System.out.println("The youngest person in attendance was " + youngest + ".");
		System.out.println("The oldest person in attendance was " + oldest + ".");
		
		
		in.close();
	}
	public static double findAverage(double total, double num) {
		double average = total / num;
		return average;
	}
}
	/*
	 * Enter age of attendee (negative number to quit): 34
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: s
	 * Enter age of attendee (negative number to quit): 16
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: b
	 * Enter age of attendee (negative number to quit): 68
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: b
	 * Enter age of attendee (negative number to quit): 53
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: s
	 * Enter age of attendee (negative number to quit): 39
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: p
	 * Enter age of attendee (negative number to quit): 23
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: s
	 * Enter age of attendee (negative number to quit): 21
	 * Enter food preference ('p' for popcorn, 's' for soda, 'b' for both: s
	 * Enter age of attendee (negative number to quit): -1
	 * age 0 to 18: 1
	 * age 19 to 30: 2
	 * age 31 to 40: 2
	 * age 41 to 60: 1
	 * over 60: 1
	 * food preference popcorn: 1
	 * food preference soda: 4
	 * food preference both: 2
	 * The average age was 36.3
	 * The youngest person in attendance was 16.
	 * The oldest person in attendance was 68.
	 */



