package a9_1;

public class MonthTest {
	public static void main(String[] args) {
		Month month1 = new Month(2);
		Month month2 = new Month();
		Month month3 = new Month("August");
		Month month4 = new Month();

		
		month2.setMonthNumber(12);
		System.out.println(month2.getMonthNumber());
		
		System.out.println(month1.getMonthName());
		
		if (month2.equals(month4))
			System.out.println(month2 + " equals " + month4);
		else
			System.out.println(month2 + " doesnt equal " + month4);
		
		Month month5 = new Month (8);
		month3.toString();
		
		if (month3.equals(month5))
			System.out.println(month3 + " equals " + month5);
		else
			System.out.println(month3 + " doesnt equal " + month5);
		
		if (month4.lessThan(month2))
			System.out.println(month4 + " is less than " + month2);
		else
			System.out.println(month4 + " is not less than " + month2);
		
		if (month3.greaterThan(month2))
			System.out.println(month3 + " is greater than " + month2);
		else
			System.out.println(month3 + " is not greater than " + month2);
	}
}
	/*
	 * 12
February
December doesnt equal January
August equals August
January is less than December
August is not greater than December

	 */

