package a2_3;
import java.util.Scanner;

public class a2_3 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter degrees Celsius: ");
		double celsius = in.nextDouble();
		double fahrenheit = findFahrenheit(celsius);
		
		System.out.print(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
		in.close();
	}
	
	public static double findFahrenheit(double c) {
		double f = (9 * c) / 5;
		f += 32;
		return f;
	}
	
	/*
	 * enter degrees Celsius: 30
	 * 30.0 degrees Celsius is 86.0 degrees Fahrenheit
	 */
}
