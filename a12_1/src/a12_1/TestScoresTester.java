package a12_1;

public class TestScoresTester {
	public static void main(String[] args) {
		int[] classScores = {100, 50, 73, -10, 30, 110};
		
		
		try {
			TestScores tests = new TestScores(classScores);
			tests.printScores();
			System.out.printf("average: %.2f%n", tests.findAverage());
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
