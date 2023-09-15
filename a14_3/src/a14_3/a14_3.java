package a14_3;

public class a14_3 {
	
	public static void sortArray(int[] arr) {
		int countIndex = 0;
		int indexOfMin = 0;
		int minimum = arr[0];
		//if (countIndex >= arr.length)
			//System.exit(0);
		while (countIndex < arr.length) {
			for (int i = countIndex; i < arr.length; i++) {
				if (arr[i] < minimum) {
					minimum = arr[i];
					indexOfMin = i;
				}
			}
			swap(arr, countIndex, indexOfMin);
			sortArray(arr);
		
		}
		countIndex++;
	}
	
	
	public static void swap(int[] array, int num1, int num2) {
		int temporary = array[num1];
		array[num1] = array[num2];
		array[num2] = temporary;
	}
	
	
	public static void main(String[] args) {
		int[] array = {16, 4, 1, 3, 2, 10};
		sortArray(array);
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + ", ");
		}
	}
}
