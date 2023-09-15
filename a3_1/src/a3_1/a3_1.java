package a3_1;
import java.util.Scanner;

public class a3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the type of figure (s or t): ");
		String shape = in.next();
		if (shape.equals("s")) {
			System.out.print("Enter the length of a side: ");
			int length = in.nextInt();
			int sqArea = sArea(length);
			System.out.print("The area is " + sqArea);
		}
		else if (shape.equals("t")) {
			System.out.print("Enter the base: ");
			int base = in.nextInt();
			System.out.print("Enter the height: ");
			int height = in.nextInt();
			double trArea = tArea(base, height);
			System.out.print("The area is " + trArea);
		}
		in.close();
	}
	public static int sArea(int side) {
		int a = side * side;
		return a;
	}
	public static double tArea(int base, int height) {
		double a = 0.5 * base * height;
		return a;
	}
	
/*
 * Enter the type of figure (s or t): t
 * Enter the base: 4
 * Enter the height: 3
 * The area is 6.0
 */
	
	/*
	 * Enter the type of figure (s or t): s
	 * Enter the length of a side: 9
	 * The area is 81
	 */
}
