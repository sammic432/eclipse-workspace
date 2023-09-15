package a2_1;
import java.util.Scanner;


public class a2_1{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter pounds: ");
		int pounds = in.nextInt();
		
		System.out.println(pounds + " pounds is " + poundsToOunces(pounds) + " ounces.");
		
		in.close();
	}
	public static int poundsToOunces(int pounds) {
		int ounces = pounds * 16;
		return ounces;
	}
}

/*
 * enter pounds: 4
 * 4 pounds is 64 ounces.

 */