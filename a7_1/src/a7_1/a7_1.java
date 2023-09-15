package a7_1;
import java.util.Scanner;

public class a7_1 {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 1000;
		int[] arr = new int[ARRAY_SIZE];
		
		Scanner in = new Scanner(System.in); 
		int num = 0;
		System.out.print("Enter a non-negative integer (negative to quit): ");
		num = in.nextInt();
		
		while (num > 0) {
			addInt(num, arr);
			
			System.out.print("Enter a non-negative integer (negative to quit): ");
			num = in.nextInt();
			
			if (num < 0) {
				print(arr);
				System.exit(0);
			}
		}

		
		in.close();
	}
	public static void addInt(int n, int[] array) {
		if (numExists(n,array) == false) {
			array[findIndex(array)] = n;
		}
	}
	
	public static void print(int[] array) {
		System.out.println("You entered: ");
		for (int i = 1; i < findIndex(array); i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static boolean numExists(int n, int[] array) {
		boolean result = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n && result == false)
				result = true;
		}
		return result;
	}
	
	public static int findIndex(int[] array) {
		int index = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == 0 && index == 0) {
				index = i;
			}
		}
		return index;
	}
}
	/*
	 * Enter a non-negative integer (negative to quit): 1
Enter a non-negative integer (negative to quit): 2
Enter a non-negative integer (negative to quit): 3
Enter a non-negative integer (negative to quit): 2
Enter a non-negative integer (negative to quit): 1
Enter a non-negative integer (negative to quit): 6
Enter a non-negative integer (negative to quit): 3
Enter a non-negative integer (negative to quit): 4
Enter a non-negative integer (negative to quit): 5
Enter a non-negative integer (negative to quit): 2
Enter a non-negative integer (negative to quit): -4
You entered: 
1 2 3 6 4 5 
	 */

