package a2;

import java.util.Scanner;

public class A2Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int n = scan.nextInt();
		final String[] names = new String[n];
		final double[] prices = new double[n];
		final double[] cals = new double[n];

		int vn = 0;
		for (int i = 0; i < n; i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
			if (scan.nextBoolean()) {
				vn++;
			}
			cals[i] = (scan.nextInt() / prices[i]);
		}
		scan.close();

		double hc = cals[0];
		double lc = cals[0];
		String hC = names[0];
		String lC = names[0];
		for (int i = 1; i < n; i++) {
			if (cals[i] > hc) {
				hc = cals[i];
				hC = names[i];
			}
			if (cals[i] < lc) {
				lc = cals[i];
				lC = names[i];
			}
		}

		System.out.println("Number of vegetarian ingredients: " + vn);
		System.out.println("Highest cals/$: " + hC);
		System.out.println("Lowest cals/$: " + lC);
	}
	
	
	
}
