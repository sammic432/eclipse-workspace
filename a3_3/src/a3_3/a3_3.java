package a3_3;
import java.util.Scanner;

public class a3_3 {
	public static void main(String[] args) {
		double result = 0.0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double firstNum = in.nextDouble();
		System.out.print("Enter an operator (+,-,x,/): ");
		String operator = in.next();
		System.out.print("Enter second number: ");
		double secondNum = in.nextDouble();
		
		switch(operator) {
			case "+": 
				result = firstNum + secondNum;
				break;
			case "-": 
				result =  firstNum - secondNum;
				break;
			case "x": 
				result = firstNum * secondNum;
				break;
			case "/": 
				result = firstNum / secondNum;
				break;
		}
		
		System.out.print(firstNum + operator + secondNum + " = " + result);
		
		in.close();
	}
	
	/*
	 * Enter a number: 3
	 * Enter an operator (+,-,x,/): +
	 * Enter second number: 2
	 * 3.0+2.0 = 5.0
	 * 
	 * Enter a number: 5
	 * Enter an operator (+,-,x,/): -
	 * Enter second number: 9
	 * 5.0-9.0 = -4.0
	 * 
	 * Enter a number: 3
	 * Enter an operator (+,-,x,/): x
	 * Enter second number: 5
	 * 3.0x5.0 = 15.0
	 * 
	 * Enter a number: 12
	 * Enter an operator (+,-,x,/): /
	 * Enter second number: 4
	 * 12.0/4.0 = 3.0
	 */
}
