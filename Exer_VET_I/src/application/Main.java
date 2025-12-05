package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number will be entered? ");
		int quantity = sc.nextInt();
		
		int[] arr = new int [quantity];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i]);				
			}
		}
		sc.close();
	}

}
