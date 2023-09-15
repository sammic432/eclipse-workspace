// Sammi Chen, Feb 22, 2021 CS 111B instructor: Dave Harden

// This program uses a series of methods to draw a rocket. The rocket is split into the top cone, a 
// number of stages, and the bottom cone. This program prompts the user to input values (lines 27-45) 
// for the height, width, and number of stages designated to make the rocket. It uses the width to 
// make a cone that will fit for both even and odd width lengths (lines 48-91). It then draws the 
// stage using drawBox (lines 94-101), which calls on the drawHorizontalLine and draw2VerticalLines 
// (lines 104-122). These methods are all used in drawBox, which is used in drawRocket. This final
// method puts together the top cone, the boxes, and the bottom cone to make the full rocket.

package a5_1;
import java.util.Scanner;

public class a5_1 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int stageWidth = getWidth();
		int stageHeight = getHeight();
		int numStages = getNumStages();
		
		drawRocket(stageHeight, stageWidth, numStages);
		
		in.close();
	}
	
	
	// getWidth prompts the user to enter the width of the stage and returns the width
	public static int getWidth() {
		System.out.print("Enter the width of each stage: ");
		return in.nextInt();
	}
	
	
	// getHeight prompts the user to enter the height of the stage and returns the height
	public static int getHeight() {
		System.out.print("Enter the height of each stage: ");
		return in.nextInt();
	}
	
	
	// getNumStages prompts the user to enter the number of the stages and returns that value
	public static int getNumStages() {
		System.out.print("Enter number of stages: ");
		return in.nextInt();
	}
	
	
	// In this drawCone method, I first checked if the width was an even or odd number, so
	// I would know how the tip of the cone would look. The first 'for' loop that I used (with
	// the variable 'i') is the counter for the number of lines needed for the cone and is also
	// used for calculating the spaces between each *. The second 'for' loop (with the variable
	// 'j'), is the counter for the amount of spaces before the first *. After printing out the
	// number of spaces, I then printed *, and created a new variable x to calculate the amount
	// of space between each * by using the variable i from the initial 'for' loop, and printed 
	// a * after. This method prints out the cone the way it's supposed to work, whether the
	// width is even or odd.
	public static void drawCone(int width) {
		if (width % 2 == 1) {
			for (int i = 0; i < width/2 + 1; i++) {
				for (int j = width/2; j > i; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				int x = i * 2 - 1;
				if (x > 0) {
					while (x > 0) {
						System.out.print(" ");
						x--;
					}
					System.out.println("*");
				}
				else
					System.out.println(" ");
				
			}
		}
		else if (width % 2 == 0) {
			for (int i = 0; i < width/2; i++) {
				for (int j = width/2; j > i + 1; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				int x = i * 2;
				while (x > 0) {
					System.out.print(" ");
					x--;
				}
				System.out.println("*");
			}
		}
	}
	
	
	// The method drawBox calls upon the other methods, drawHorizontalLine & draw2VerticalLines
	// to draw the borders of a box. The method takes in the width and height as arguments and
	// puts uses them in the other methods inside drawBox.
	public static void drawBox(int width, int height) {
		drawHorizontalLine(width);
		draw2VerticalLines(height, width);
		drawHorizontalLine(width);
	}
	
	
	// drawHorizontalLine takes in a variable 'w' (width) and simply uses a 'for' loop to print
	// out a line of *'s the length of the value of the variable 'w'
	public static void drawHorizontalLine(int w) {
        for (int i = 0; i < w; i++){    
            System.out.print("*");
        }
        System.out.println();
    }
	
	
	// draw2VerticalLines takes in the parameters of 'h' and 'w' and uses a 'for' loop to print 
	// out each row 1 by 1 according to the height of each stage. Inside the 'for' loop, the 
	// method drawOneRow is used with the variable w to make 2 vertical lines for the sides of
	// the stage
	public static void draw2VerticalLines(int h, int w) {
        for (int rowCount = 0; rowCount < h-2; rowCount++){
            drawOneRow(w);
        }
    }
	
	
	// drawOneRow is used to print each row of the sides of the box. This method prints a * and
	// uses the parameter 'w' to print out the amount of space needed, then the second * by using
	// a 'for' loop
    public static void drawOneRow(int w) {
        System.out.print("*");
        for (int spaceCount = 0; spaceCount < w-2; spaceCount++){    
            System.out.print(" ");
        }
        System.out.println("*");
    }
    
    // This method is the one that ties all the other methods together and draws the full rocket.
    // It takes in the height, width, and number of stages as parameters and uses them in the 
    // drawCone and drawBox methods. After drawing the first initial cone, a 'for' loop is used
    // to print the number of stages needed, and then another cone is drawn to complete the 
    // rocket.
    public static void drawRocket(int height, int width, int num) {
    	drawCone(width);
		for (int i = 0; i < num; i++) {
			drawBox(width, height);
		}
		drawCone(width);
    }
}
    /*
     * Enter the width of each stage: 4
Enter the height of each stage: 4
Enter number of stages: 2
 **
*  *
****
*  *
*  *
****
****
*  *
*  *
****
 **
*  *



Enter the width of each stage: 5
Enter the height of each stage: 5
Enter number of stages: 2
  * 
 * *
*   *
*****
*   *
*   *
*   *
*****
*****
*   *
*   *
*   *
*****
  * 
 * *
*   *
     */


