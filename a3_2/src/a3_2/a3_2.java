package a3_2;
import java.util.Scanner;

public class a3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of years of education: ");
		int years = in.nextInt();
		
		if (years > 12) {
			System.out.print("college");
		}
		else if (years >= 9) {
			System.out.print("high school");
		}
		else if (years >= 7) {
			System.out.print("middle school");
		}
		else if (years >= 1) {
			System.out.print("elementary school");
		}
		else if (years <= 0) {
			System.out.print("none");
		}
		
		in.close();
	}
	/*
	 * Enter number of years of education: 0
	 * none
	 * 
	 * Enter number of years of education: 1
	 * elementary school
	 * 
	 * Enter number of years of education: 8
	 * middle school
	 * 
	 * Enter number of years of education: 10
	 * high school
	 * 
	 * Enter number of years of education: 14
	 * college
	 */
}
