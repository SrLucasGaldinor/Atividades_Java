package application;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee e = new Employee(name, grossSalary, tax);
		
		System.out.println("Employee: " + e.getName() + ", $ "  + e.netSalary());
		
		System.out.println("Wich percentage to increase salary?");
		double increase = sc.nextDouble();
		
		e.increaseSalary(increase);
		
		System.out.println("Update data: " + e.getName() + ", $ " + e.getGrossSalary());
		
		sc.close();
		
	}

}
