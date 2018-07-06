package org.careerdevs;

public class Transaction {

	private double amount;
	private BankAccount account;

	public Transaction(double amount) {
		this.amount = amount;
	}
	
	public static double deposit(BankAccount account, double amount) {
		
		double balance = CheckingAccount.getBalance() + amount;
		
		//balance += amount;
		return balance;
	}
	
	public static double withdraw(BankAccount account, double amount) {
		
		double balance = CheckingAccount.getBalance() - amount;
		
		//balance -= amount;
		return balance;
	}
}
