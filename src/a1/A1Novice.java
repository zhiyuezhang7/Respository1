// package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		final int count = scan.nextInt();

		final String[] names = new String[count];
		final double[] total = new double[count];

		for (int i = 0; i < count; i++) {
			names[i] = scan.next().charAt(0) + ". " + scan.next() + ": ";
			int index = scan.nextInt();
			final double[] sum = new double[count];
			for (int j = 0; j < index; j++) {
				sum[j] = scan.nextDouble();
				scan.next();
				sum[j] *= scan.nextDouble();
				if (j == index - 1) {
					for (int k = 0; k < index; k++) {
						total[i] += sum[k];
					}
				}
			}
		}

		scan.close();
		for (int i = 0; i < count; i++) {
			if (i == count - 1) {
				System.out.println(names[i] + total[i]);
				break;
			}
			System.out.println(names[i] + total[i] + " ");
		}



		/**
		 * For example, the following input:
		 * 
		 * 3 
		 * Carrie Brownstein 3 
		 * 2 Banana 0.75 
		 * 1 Orange 1.25 
		 * 2 Milk 3.15 
		 * Corin Tucker 2
		 * 3 Banana 0.75 
		 * 2 Sponge 1.15 
		 * Janet Weiss 1 
		 * 5 Salami 2.50 
		 * Should produce the
		 * following output:
		 * 
		 * C. Brownstein: 9.05 C. Tucker: 4.55 J. Weiss: 12.50
		 */

	}
}
