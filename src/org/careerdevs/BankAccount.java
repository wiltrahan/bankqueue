package org.careerdevs;

public class BankAccount {
	
	private String accountType;
	private String customerName;
	private String accountId;
	
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	public static void main(String[] args) {

		BankAccount account = new BankAccount(account);
		
		account.initialDeposit();
		
		
	}

	public BankAccount(String accountType, String customerName, String accountId) {
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountId = accountId;
	}
	
	
	


}
