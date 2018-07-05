package org.careerdevs;

public class Transaction {

	private double amount;

	public Transaction(double amount) {
		this.amount = amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
