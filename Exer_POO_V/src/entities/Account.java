package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account() {

	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		balance = 0.0;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount - 5;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account " + number + ", ")
		.append("Holder: " + holder + ", ")
		.append("Balance: $" + String.format("%.2f", balance));
		return sb.toString();
	}
}
