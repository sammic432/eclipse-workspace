package a12_1;

public class TestScoresPlus {
	
	private int[] scores;
	
	public TestScoresPlus(int[] arr) throws InvalidTestScore {
		scores = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] > 100) {
				throw new InvalidTestScore("Invalid score at " + i);
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
	
	public static class InvalidTestScore extends Exception{
		public InvalidTestScore(String errorMsg){
			System.out.print(errorMsg);
			
		}
	}
}


