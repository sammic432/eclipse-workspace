package a14_2;
import java.util.Scanner;

public class a14_2 {
	
	public static boolean isPalindrome(String str, int bound1, int bound2) {
		boolean out = true;
		if (bound1 - 1 != bound2) {
			if (str.charAt(bound2) == str.charAt(bound1 - 1))
				out = isPalindrome(str, bound1 + 1, bound2 - 1);
			else
				out = false;
		}
		return out;
		
	}
	
	public static String newString(String str) {
		String newStr = "";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) != ' ' && str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				newStr += str.charAt(i);
		}
		//System.out.println(newStr);
		return newStr;
	}
	
	public static void main(String[] args) {
		//String pal = "taco cat";
		
		//if (isPalindrome(pal,1,6)) {
			//System.out.print("yes");
		//}
		//else
			//System.out.print("no");
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = in.nextLine();
		while (!input.equals("quit")) {
			String s = newString(input);
			if (isPalindrome(s, 1, s.length() - 1))
				System.out.println(input + " is a palindrome");
			else
				System.out.println(input + " is not a palindrome");
			System.out.print("Enter a string: ");
			input = in.nextLine();
		}
		
		in.close();
	}
}
/*
 * Enter a string: Taco cat
Taco cat is a palindrome
Enter a string: Able was I, ere I saw Elba
Able was I, ere I saw Elba is a palindrome
Enter a string: peanut butter
peanut butter is not a palindrome
Enter a string: quit

 */

