package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0, avg;

		System.out.print("How many number will be entered? ");
		int quantity = sc.nextInt();

		double[] arr = new double[quantity];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}

		System.out.print("VALORES = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(String.format("%.2f", arr[i]) + " ");
		}

		System.out.printf("%nSOMA = %.2f%n", sum);
		System.out.printf("AVG = %.2f%n", sum / quantity);
		sc.close();

	}
}
