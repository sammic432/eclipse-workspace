package a12_1;

public class Month {

	int monthNumber;
		
		
	// constructor that takes no arguments and automatically
	// sets the month data to the first month
	public Month() {
		monthNumber = 1;
	}
		
		
	// constructor that takes an int as an argument and sets
	// the month data to that int
	public Month(int monthNum) throws InvalidMonth {
		if (monthNum < 1 || monthNum > 12)
			throw new InvalidMonth("Invalid month information entered");
		else
			monthNumber = monthNum;
	}
		
		
	// constructor that takes a String(the name of the month)
	// as an argument and sets the month data to the month
	// number corresponding to the String
	public Month(String month) throws InvalidMonth {
		String monthInput = month.toLowerCase();
		switch (monthInput) {
		case "january":
			monthNumber = 1;
			break;
		case "february":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		case "july":
			monthNumber = 7;
			break;
		case "august":
			monthNumber = 8;
			break;
		case "september":
			monthNumber = 9;
			break;
		case "october":
			monthNumber = 10;
			break;
		case "november":
			monthNumber = 11;
			break;
		case "december":
			monthNumber = 12;
			break;
		default:
			throw new InvalidMonth("Invalid month information entered");
		}
	}
		
		
	// the method setMonthNumber takes an int as the argument
	// and sets the month data as that int
	public void setMonthNumber(int month) {
		monthNumber = month;
	}
		
		
	// this method returns the month data
	public int getMonthNumber() {
		return monthNumber;
	}
		
		
	// this method uses the month number to figure out the 
	// corresponding month name and returns the month name as
	// a String
	public String getMonthName(){
		String monthName = "";
		switch(monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}
		return monthName;
	}
		
		
	//this method uses the getMonthName method to return the
	// name of the month
	public String toString() {
		return getMonthName();
	}
		
		
	// this method checks if the current month is equal to the
	// month in the argument
	public boolean equals(Month month) {
		boolean result = false;
		if (month.getMonthNumber() == monthNumber)
			result = true;
		return result;
	}
		
		
	// this method checks if the current month is greater than the
	// month in the argument
	public boolean greaterThan(Month month) {
		boolean result = false;
		if (monthNumber > month.getMonthNumber())
			result = true;
		return result;
	}
		
		
	// this method checks if the current month is less than the 
	// month in the argument
	public boolean lessThan(Month month) {
		boolean result = false;
		if (monthNumber < month.getMonthNumber())
			result = true;
		return result;
	}
	
	public static class InvalidMonth extends Exception{
		public InvalidMonth(String errorMsg) {
			System.out.print(errorMsg);
		}
	}
}
