package a12_1;

public class TestScores {
	
	private int[] scores;
	
	public TestScores(int[] arr) throws IllegalArgumentException {
		scores = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] > 100) {
				throw new IllegalArgumentException("Invalid score at " + i);
			}
			else if (arr[i] >= 0 && arr[i] <= 100)
				scores[i] = arr[i];
		}
	}
	
	public void printScores() {
		for (int i = 0; i < scores.length; i ++) {
			System.out.print(scores[i] + " ");
		}
	}
	
	public double findAverage() {
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		double average = total / scores.length;
		return average;
	}
	
}
