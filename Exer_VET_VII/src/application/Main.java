package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

import entities.Person;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<Person>();
		System.out.print("How many people you will registered? ");
		int quantity = sc.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			System.out.println("Enter " + (i + 1) + " data:");
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			list.add(new Person(name, age));
		}
		
		Optional<Person> old =  list.stream().max(Comparator.comparingInt(p -> p.getAge()));
		
		System.out.println("OLDER PERSON: " + old.get().getName());
		
		sc.close();
	}

}
