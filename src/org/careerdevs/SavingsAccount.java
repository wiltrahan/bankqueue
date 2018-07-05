package org.careerdevs;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	private double balance;
	
	
	
	public SavingsAccount(String accountType, String customerName, String accountId, double interestRate,
			double balance) {
		super(accountType, customerName, accountId);
		this.interestRate = interestRate;
		this.balance = balance;
	}



	public double calcInterest() {
		
		return balance * interestRate / 100;
	}

	
}
