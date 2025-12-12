package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum = 0.0;
		int j = 0;

		System.out.print("How many elements will the vector have? ");
		int quantity = sc.nextInt();

		int[] numbers = new int[quantity];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number: ");
			numbers[i] = sc.nextInt();
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				j++;
			}
		}
		if (j == 0) {
			System.out.print("NO EVEN NUMBER");
		} else {
			System.out.print("EVEN AVERAGE = " + String.format("%.1f", sum / j));
		}
		sc.close();
	}

}
