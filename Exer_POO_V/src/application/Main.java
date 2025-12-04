package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account ac;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine(); 
				
		System.out.print("Is there an initial deposit (y/n)? ");
		String response = sc.next();
		
		if (response.equalsIgnoreCase("Y")) {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			ac = new Account(number, holder, balance);
		} else {	
			ac = new Account(number, holder);
		}
		
		System.out.println("Account data: ");
		System.out.println(ac);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		ac.deposit(amount);
		
		System.out.println("Updated account data:");
		System.out.println(ac);
		
		System.out.println("Enter a withdraw value: ");
		double amountWithdraw = sc.nextDouble();
		ac.withdraw(amountWithdraw);
		
		System.out.println("Updated account data:");
		System.out.println(ac);
		
		sc.close();
	}
}
