package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		Rent[] rooms = new Rent[10];
		
		for(int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int roomIndex = sc.nextInt();
			
			rooms[roomIndex] = new Rent(name, email);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d: %s, %s%n", i, rooms[i].getName(), rooms[i].getEmail());
			}
		}
		sc.close();
	}
}
