package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many values will each vector have? ");
		int quantity = sc.nextInt();
		
		int[] arrA = new int[quantity],
			  arrB = new int[quantity],
			  arrC = new int[quantity];
		
		System.out.println("Enter Vector A values: ");
		for(int i = 0; i < quantity; i++) {
			arrA[i] = sc.nextInt();
		}
		
		System.out.println("Enter Vector B values: ");
		for(int i = 0; i < quantity; i++) {
			arrB[i] = sc.nextInt();
			arrC[i] = arrA[i] + arrB[i];
		}
		
		System.out.println("RESULT: ");
		for(int i = 0; i < quantity; i++) {
			System.out.println(arrC[i]);
		}
	
		sc.close();
	}

}
