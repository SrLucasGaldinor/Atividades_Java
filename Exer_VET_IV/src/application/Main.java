package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int max = 0, pos = 0;

		System.out.print("How many number will be registered? ");
		int quantity = sc.nextInt();

		int[] arr = new int[quantity];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] < arr[j + 1] && arr[j] > max) {
					max = arr[j];
					pos = j;
				}
			}
		}

		System.out.println("MAX VALUE = " + max);
		System.out.println("POSITION OF MAX VALUE = " + pos);
		sc.close();
	}
}
