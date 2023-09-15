package a9_2;
import java.util.Scanner;

public class GeometryTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
		System.out.println("");
		
		System.out.print("Enter your choice (1-4): ");
		int choice = in.nextInt();
		
		if(choice < 1 || choice > 4) 
			System.out.print("Error: not a choice");
		else if (choice == 1) {
			System.out.print("Enter radius of circle: ");
			int radius = in.nextInt();
			double cArea = Geometry.circleArea(radius);
			System.out.printf("%.2f", cArea);
		}
		else if (choice == 2) {
			System.out.print("Enter length of rectangle: ");
			int length = in.nextInt();
			System.out.print("Enter width of rectangle: ");
			int width = in.nextInt();
			System.out.print(Geometry.rectangleArea(length, width));
		}
		else if (choice == 3) {
			System.out.print("Enter base of triangle: ");
			int base = in.nextInt();
			System.out.print("Enter height of triangle: ");
			int height = in.nextInt();
			System.out.print(Geometry.triangleArea(base, height));
		}
		else if (choice == 4)
			System.exit(0);
		
		in.close();
	}
	
}
	/*
	 * Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit

Enter your choice (1-4): 1
Enter radius of circle: 3
28.27

Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit

Enter your choice (1-4): 2
Enter length of rectangle: 4
Enter width of rectangle: 3
12

Geometry Calculator
1. Calculate the Area of a Circle
2. Calculate the Area of a Rectangle
3. Calculate the Area of a Triangle
4. Quit

Enter your choice (1-4): 3
Enter base of triangle: 5
Enter height of triangle: 3
7.5
	 */

