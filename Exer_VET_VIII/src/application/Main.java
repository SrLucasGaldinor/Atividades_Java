package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sum = 0.0, greater = 0.0, lower = 0.0;
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

			if (people[i].getGender().equalsIgnoreCase("F")) {
				sum += people[i].getHeight();
				numberOfWomen++;
			}
		}
		
		lower = people[0].getHeight();
		
		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < people.length - 1; j++) {
				if (people[i].getHeight() > people[j + 1].getHeight() && people[i].getHeight() > greater) {
					greater = people[i].getHeight();
				}
				if (people[i].getHeight() < people[j + 1].getHeight() && people[i].getHeight() < lower) {
					lower = people[i].getHeight();
				}
			}
		}
		System.out.println("Lower = " + lower);
		System.out.println("Greater = " + greater);
		System.out.println("Average Heights = " + String.format("%.2f", sum / numberOfWomen));
		System.out.println("Number of Men = " + (quantity - numberOfWomen));

		sc.close();
	}

}
