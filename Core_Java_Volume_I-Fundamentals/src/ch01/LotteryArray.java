package ch01;

public class LotteryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10;
		int[][] odds = new int[MAX+1][];
		for (int i = 0; i <= MAX; i++) {
			odds[i] = new int[i+1];
		}
		for (int i = 0; i < odds.length; i++) {
			for (int j = 1; j < odds[i].length; j++) {
				int lotteryOdds = 1;
				for (int k = 0; k < j; k++) {
					lotteryOdds = lotteryOdds*(i-k+1)/k;
				}
				odds[i][j] = lotteryOdds;
			}
			for (int[] is : odds) {
				for (int j : is) {
					System.out.printf("%4d",j);
				}
				System.out.println();
			}
		}
	}

}
