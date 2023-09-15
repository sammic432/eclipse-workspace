package a2_2;
import java.util.Scanner;

public class a2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter number of cents: ");
		int cents = in.nextInt();
		
		int pennies;
		int quarters = cents / 25;
		int newCents= cents - (quarters * 25);
		int dimes = newCents / 10;
		newCents -= dimes * 10;
		int nickels = newCents / 5;
		if (nickels == 1) {
			newCents -= 5;
			pennies = newCents % 10;
		}
		else {
			pennies = cents % 10;
		}
		
		System.out.println("pennies: " + pennies);
		System.out.println("nickels: " + nickels);
		System.out.println("dimes: "+ dimes);
		System.out.println("quarters: " + quarters);
		
		in.close();
		
		/*
		 * enter number of cents: 119
		 * pennies: 4
		 * nickels: 1
		 * dimes: 1
		 * quarters: 4

		 */
	}

}
