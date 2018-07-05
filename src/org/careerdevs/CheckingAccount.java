package org.careerdevs;

public class CheckingAccount extends BankAccount {

	private double serviceFee;
	private double balance;
	
	
	
	public CheckingAccount(String accountType, String customerName, String accountId, double serviceFee,
			double balance) {
		super(accountType, customerName, accountId);
		this.serviceFee = serviceFee;
		this.balance = balance;
	}

	public double deposit() {
		
		return balance;
	}
	
	public double withdraw() {
		
		return balance;
	}

}
