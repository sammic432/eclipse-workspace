package a14_1;

public class a14_1 {
	
	public static void reverseWithinBounds(char[] array, int bound1, int bound2) {
		if (bound2 == bound1 - 1)
			return;
		char c = array[bound1];
		array[bound1] = array[bound2];
		array[bound2] = c;
		reverseWithinBounds(array, bound1 + 1, bound2 - 1);
	}
	
	public static void main(String[] args) {
		char[] arr = new char[6];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		arr[5] = 'F';
		reverseWithinBounds(arr, 1, 4);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	//A E D C B F 
}
