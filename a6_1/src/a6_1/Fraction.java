// Sammi Chen, Mar 8, 2021 CS 111B instructor: Dave Harden

// This program simulates the creation and operations of fractions. Since a fraction always
// has a numerator and denominator, the variables num and den are initialized to represent 
// the original numerator and denominator, whereas newNum and newDen represent the numbers
// with which the final fraction will be rewritten. These variables are found in lines 14-16.
// The class constructors (lines 18-27) use the variables num and den and set them to a value.
// The method in lines 30-101 replicate the mathematical operations used on fractions and return
// the correct calculation. In lines 104-114, the method isEqualTo checks if a fraction holds the
// same value as another, and the simplify method finds the gcf and simplifies the fraction.
package a6_1;

public class Fraction {
	int num;
	int den;
	int newNum, newDen;
	
	public Fraction() {
		num = 0;
		den = 1;
	}
	
	public Fraction(int numerator, int denominator) {
		num = numerator;
		den = denominator;
		simplify();
	}
	
	
	// The method addedTo first checks if there's a common denominator between the 
	// 2 fractions using an if statement, where if there is a common denominator, the
	// variable newNum has a new value of the original numerator + parameter numerator,
	// and the newDen copies the value of the original denominator. If there is no common
	// denominator, it calculates the common denominator and sets it as newDen, whereas
	// newNum takes on the value of the original numerator * parameter denominator plus
	// the product of the parameter numerator and the original denominator. Then, with
	// these newNum and newDen values, a new fraction is created, simplified, and returned
	public Fraction addedTo(Fraction fra2) {
		if (den != fra2.den) {
			newNum = (num * fra2.den) + (fra2.num * den);
			newDen = den * fra2.den;
		}
		else if (den == fra2.den) {
			newNum = num + fra2.num;
			newDen = den;
		}
		Fraction result = new Fraction(newNum, newDen);
		result.simplify();
		return result;
	}
	
	
	// The method subtract first checks if there's a common denominator between the 
	// 2 fractions using an if statement, where if there is a common denominator, the
	// variable newNum has a new value of the original numerator - parameter numerator,
	// and the newDen copies the value of the original denominator. If there is no common
	// denominator, it calculates the common denominator and sets it as newDen, whereas
	// newNum takes on the value of the original numerator * parameter denominator minus
	// the product of the parameter numerator and the original denominator. Then, with
	// these newNum and newDen values, a new fraction is created, simplified, and returned
	public Fraction subtract(Fraction fra2) {
		if (den != fra2.den) {
			newNum = (num * fra2.den) - (fra2.num * den);
			newDen = den * fra2.den;
		}
		else if (den == fra2.den) {
			newNum = num - fra2.num;
			newDen = den;
		}
		Fraction result = new Fraction(newNum, newDen);
		result.simplify();
		return result;
	}
	
	
	// The method multipliedBy sets the variables newNum and newDen to new values,
	// where the new numerator is the original numerator * parameter numerator, and the
	// new denominator is the original denominator * parameter denominator. Then it creates
	// a new fraction with these newNum and newDen values and uses the simplify method,
	// and returns that fraction.
	public Fraction multipliedBy(Fraction fra2) {
		newNum = num * fra2.num;
		newDen = den * fra2.den;
		Fraction result = new Fraction(newNum, newDen);
		result.simplify();
		return result;
	}
	
	
	// The method dividedBy sets the variables newNum and newDen to new values,
	// where the new numerator is the original numerator * parameter denominator, and the
	// new denominator is the original denominator * parameter numerator. Then it creates
	// a new fraction with these newNum and newDen values and uses the simplify method,
	// and returns that fraction.
	public Fraction dividedBy(Fraction fra2) {
		newNum = num * fra2.den;
		newDen = den * fra2.num;
		Fraction result = new Fraction(newNum, newDen);
		result.simplify();
		return result;
	}
	
	
	// The method isEqualTo takes a fraction for a parameter and simplifies it first, then
	// it checks if the values of the original numerator and the parameter numerator are
	// equal, then does the same for the denominators. This method returns true if both
	// numerator and denominator are equal between the 2 fractions, and false if not.
	public boolean isEqualTo(Fraction fraction) {
		fraction.simplify();
		if (num == fraction.num && den == fraction.den)
			return true;
		else
			return false;
	}
	
	
	// This simplify method uses an if statement to find the lesser value between the
	// numerator and denominator, and stores it in the variable less. Then the method uses
	// a for loop counting backwards from the value of less, and checks to find the greatest
	// common factor by checking if the numerator and denominator are divisible by the 
	// variable i in the for loop, and sets the simplified numerator and denominator values
	public void simplify() {
		int less;
		if (num < den)
			less = num;
		else
			less = den;
		
		for (int i = less; i > 0; i --) {
			if (num % i == 0 && den % i == 0) {
				num = num / i;
				den = den / i;
			}
		}
	}
	
	
	// This print method prints out the fraction in a format easier to understand
	public void print() {
		System.out.print(num + "/" + den);
	}
}

/*
 * The result starts off at 0/1
The product of 9/8 and 2/3 is 3/4
The quotient of 9/8 and 2/3 is 27/16
The sum of 9/8 and 2/3 is 43/24
The difference of 9/8 and 2/3 is 11/24
The two Fractions are not equal.
The product of 3/2 and 2/3 is 1/1
*/
