package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		double sum = 0.0, per = 0.0;
//		int j = 0;
//
//		System.out.println("How many people will be registered? ");
//		int quantity = sc.nextInt();
//
//		Person[] list = new Person[quantity];
//
//		for (int i = 0; i < list.length; i++) {
//			System.out.println("User data " + (i + 1) + ":");
//			System.out.print("Name: ");
//			String name = sc.next();
//
//			System.out.print("Age: ");
//			int age = sc.nextInt();
//
//			System.out.print("Height: ");
//			double height = sc.nextDouble();
//			
//			list[i] = new Person(name, age, height);
//			
//			if(list[i].getAge() < 16) {
//				j++;
//			}
//			
//			sum += list[i].getHeight();
//		}
//
//		per = (double)  j / quantity * 100;
//		
//		System.out.printf("AVG = %.2f%n", sum / quantity);
//		System.out.printf("People under 16 years old: %.1f%% %n", per);
//		
//		for (int i = 0; i < list.length; i++) {
//			if(list[i].getAge() < 16) {
//				System.out.println(list[i].getName());
//			}
//		}
		
		double sum = 0.0, per = 0.0;
		int j = 0;

		System.out.println("How many people will be registered? ");
		int quantity = sc.nextInt();

		String[] name = new String[quantity];
		int[] age = new int[quantity];
		double[] height = new double[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.println("User data " + (i + 1) + ":");
			System.out.print("Name: ");
			name[i] = sc.next();

			System.out.print("Age: ");
			age[i] = sc.nextInt();

			System.out.print("Height: ");
			height[i] = sc.nextDouble();
			
			if(age[i] < 16) {
				j++;
			}
			
			sum += height[i];
		}

		per = (double)  j / quantity * 100;
		
		System.out.printf("AVG = %.2f%n", sum / quantity);
		System.out.printf("People under 16 years old: %.1f%% %n", per);
		
		for (int i = 0; i < quantity; i++) {
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		sc.close();
	}
}
