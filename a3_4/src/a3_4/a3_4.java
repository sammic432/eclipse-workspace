package a3_4;
import java.util.Scanner;

public class a3_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start time: ");
		int startTime = in.nextInt();
		System.out.print("Enter length of call in minutes: ");
		int timeLength = in.nextInt();
		
		System.out.printf("gross cost: $%.2f\n", getGross(timeLength));
		System.out.printf("net cost: $%.2f\n", getNet(startTime, timeLength));
		
		in.close();
	}
	public static double getGross(int length) {
		double cost = length * 0.4;
		return cost;
	}
	public static double getNet(int time, int length) {
		double cost = getGross(length);
		if (time < 800 || time > 1800) {
			cost = cost * 0.5;
		}
		if (length > 60) {
			cost = cost - (cost * 0.15);
		}
		cost = cost + (cost * 0.04);
		return cost;
	}
	
	/*
	 * Enter start time: 2322
	 * Enter length of call in minutes: 67
	 * gross cost: $26.80
	 * net cost: $11.85
	 * 
	 * Enter start time: 759
	 * Enter length of call in minutes: 10
	 * gross cost: $4.00
	 * net cost: $2.08
	 * 
	 * Enter start time: 1300
	 * Enter length of call in minutes: 100
	 * gross cost: $40.00
	 * net cost: $35.36
	 * 
	 * Enter start time: 1300
	 * Enter length of call in minutes: 10
	 * gross cost: $4.00
	 * net cost: $4.16
	 */
}
