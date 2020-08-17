package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		final int itemN = scan.nextInt();
		final String[] item = new String[itemN];
		final double[] price = new double[itemN];
		for (int i = 0; i < itemN; i++) {
			item[i] = scan.next();
			price[i] = scan.nextDouble();
		}

		final int count = scan.nextInt();
		final String[] names = new String[count];
		final double[] total = new double[count];
		final int[] index = new int[count];
		
		for (int i = 0; i < count; i++) {
			names[i] = scan.next() + " " + scan.next();
			index[i] = scan.nextInt();
			for (int j = 0; j < index[i]; j++) {
				int number = scan.nextInt();
				String itemBought = scan.next();
				for (int k = 0; k < itemN; k++) {
					if (itemBought.equals(item[k])) {
						total[i] += (number * price[k]);
					}
				}
			}
		}

		scan.close();

		double max = total[0];
		double min = total[0];
		int maxN = 0;
		int minN = 0;
		double sum = 0;
		double ave = 0;
		for (int i = 0; i < count; i++) {
			if (total[i] < min) {
				min = total[i];
				minN = i;
			}
			if (total[i] > max) {
				max = total[i];
				maxN = i;
			}
			sum += total[i];
			if (i == count - 1) {
				ave = sum / count;
			}
		}

		System.out.println("Biggest: " + names[maxN] + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + names[minN] + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", ave));	
	}
}

//6
//Apple 0.25
//Banana 0.75
//Milk 3.15
//Orange 1.25
//Salami 2.50
//Sponge 1.15
//3 
//Carrie Brownstein 3 2 Banana 1 Orange 2 Milk
//Corin Tucker 2 3 Banana 2 Sponge
//Janet Weiss 1 5 Salami

//Biggest: Janet Weiss (12.50)
//Smallest: Corin Tucker (4.55)
//Average: 8.70