package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		final int itemN = scan.nextInt();
		final String[] item = new String[itemN];
		final int[] total = new int[itemN];
		final int[] people = new int[itemN];
		for (int i = 0; i < itemN; i++) {
			item[i] = scan.next();
			scan.nextDouble();
			total[i] = 0;
			people[i] = 0;
		}

		final int count = scan.nextInt();
		final int[] index = new int[count];
		for (int i = 0; i < count; i++) {
			scan.next();
			scan.next();
			index[i] = scan.nextInt();
			String[] itemBought = new String[index[i]];
			for (int j = 0; j < index[i]; j++) {
				int number = scan.nextInt();
				itemBought[j] = scan.next();
				for (int k = 0; k < itemN; k++) {
					if (itemBought[j].equals(item[k])) {
						total[k] += number;
						if (same(itemBought, j, itemBought[j]) == 0) {
							people[k]++;
						}
					}
				}
			}
		}
		scan.close();
		for (int i = 0; i < itemN; i++) {
			if (total[i] == 0) {
				System.out.println("No customers bought " + item[i]);
			} else {
				System.out.println(people[i] + " customers bought " + total[i] + " " + item[i]);
			}
		}
		
	
	}

	static int same(String[] items, int index, String item) {
		for (int i=0; i < index; i++) {
			if (items[i].equals(item)) {
				return 1;
			}
		}
		return 0;
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

//No customers bought Apple
//2 customers bought 5 Banana
//1 customers bought 2 Milk
//1 customers bought 1 Orange
//1 customers bought 5 Salami
//1 customers bought 2 Sponge