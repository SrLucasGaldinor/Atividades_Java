package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sumWomenHeights = 0.0, greater = 0.0, lower = 0.0;
		int numberOfWomen = 0;

		System.out.print("How many people will be registered? ");
		int quantity = sc.nextInt();

		Person[] people = new Person[quantity];

		for (int i = 0; i < people.length; i++) {
			System.out.printf("Height %dª: ", i + 1);
			double height = sc.nextDouble();

			System.out.printf("Gender %dª: ", i + 1);
			String gender = sc.next().substring(0, 1);

			people[i] = new Person(height, gender);
		}
		
		greater = people[0].getHeight();
		lower = people[0].getHeight();
		
		for (int i = 0; i < people.length; i++) {
			if(people[i].getHeight() < lower) {
				lower = people[i].getHeight();
			}
			
			if(people[i].getHeight() > greater) {
				greater = people[i].getHeight();
			}
			
			if (people[i].getGender().equalsIgnoreCase("F")) {
				sumWomenHeights += people[i].getHeight();
				numberOfWomen++;
			}
		}
		System.out.println("Lower = " + lower);
		System.out.println("Greater = " + greater);
		System.out.println("Average Heights = " + String.format("%.2f", sumWomenHeights / numberOfWomen));
		System.out.println("Number of Men = " + (quantity - numberOfWomen));

		sc.close();
	}
}
