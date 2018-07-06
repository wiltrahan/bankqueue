package org.careerdevs;

public class CheckingAccount extends BankAccount {

	private double serviceFee;
	private static double balance;
	
	
	
	public CheckingAccount(String accountType, String customerName, String accountId, double serviceFee, double balance) {
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

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	public static double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
