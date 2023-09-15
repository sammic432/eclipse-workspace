package a12_1;

public class TestScoresPlusTester {
	public static void main(String[] args) {
		int[] classScores = {100, 50, 73, 10, 30, 110};
		
		
		try {
			TestScoresPlus tests = new TestScoresPlus(classScores);
			tests.printScores();
			System.out.println();
			System.out.printf("average: %.2f%n", tests.findAverage());
		}
		catch (TestScoresPlus.InvalidTestScore e) {
			System.out.println();
		}
	}
	
}
//Invalid score at 5
