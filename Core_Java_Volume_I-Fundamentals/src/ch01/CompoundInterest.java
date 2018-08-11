package ch01;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		double[] interestRate = new double[NRATES];
		for (int i = 0; i < interestRate.length; i++) {
			interestRate[i] = (STARTRATE+i)/100.0;
		}
		double[][] balances = new double[NYEARS][NRATES];
		for (int i = 0; i < balances[0].length; i++) {
			balances[0][i] = 10000;
		}
		for (int i = 1; i < balances.length; i++) {
			for (int k = 0; k < balances.length; k++) {
				double oldBalance = balances[i-1][k];
				double interest = oldBalance*interestRate[k];
				balances[i][k] = oldBalance + interest;
			}
		}
		for (int i = 0; i < interestRate.length; i++) {
			System.out.printf("%9.0f%%",100*interestRate[i]);
		}
		System.out.println();
		for (double[] ds : balances) {
			for (double d : ds) {
				System.out.printf("%10.2f",d);
			}
			System.out.println();
		}
		
	}

}
