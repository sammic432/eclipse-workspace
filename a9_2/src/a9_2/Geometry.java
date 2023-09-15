// Sammi Chen, Apr 5, 2021 CS 111B instructor: Dave Harden

// this class has 3 different methods to calculate the area of different
// shapes. In each method, the program first checks if the parameter input
// is a negative number and will end the program if it is. The argument stands
// for the dimension of the shape, and if they are positive, the program
// will plug it in to the corresponding area formula to find the area of the
// shape and 


package a9_2;

public class Geometry {
	
	// the method circleArea takes an int as an argument and uses the
	// area of a circle formula to find and return the area of the circle
	// with a radius of the int from the argument
	public static double circleArea(int radius) {
		double area = 0.0;
		if (radius < 0) {
			System.out.print("error: negative value");
			System.exit(0);
		}
		else {
			area = radius * radius * Math.PI;
		}
		return area;
	}
	
	
	// the method rectangleArea takes 2 ints as an argument, 1 for length
	// and 1 for width. this method then calculates the area by multiplying
	// the length and width together and returns that value
	public static int rectangleArea(int length, int width) {
		int area = 0;
		if (length < 0 || width < 0) {
			System.out.print("error: negative value");
			System.exit(0);
		}
		else
			area = length * width;
		return area;
	}
	
	
	// this method calculates the area of a triangle by using the base and
	// height arguments and plugging them into the formula to find a triangle.
	// then it returns the value of the area of the triangle
	public static double triangleArea(int base, int height) {
		double area = 0.0;
		if (base < 0 || height < 0) {
			System.out.print("error: negative value");
			System.exit(0);
		}
		else
			area = base * height * 0.5;
		return area;
	}
}
