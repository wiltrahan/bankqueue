package org.careerdevs;

public class Transaction {

	private double amount;
	private BankAccount account;

	public Transaction(double amount) {
		this.amount = amount;
	}
	
	public double deposit(BankAccount account, double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(BankAccount account, double amount) {
		balance -= amount;
		return balance;
	}
}
