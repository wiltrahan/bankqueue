package org.careerdevs;

public class BankAccount {
	
	private String accountType;
	private String customerName;
	private String accountId;
	
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	public static void main(String[] args) {
		
		
		BankAccount account = new BankAccount("Checking", "Frank Jones", "452245431");
		CheckingAccount check = new CheckingAccount("Checking", "Mike Jones", "43424599", 11.00, 890.00);
		
//		account.initialDeposit();
		Transaction.deposit(check, 50.00);
		
		System.out.println(check.getBalance());
		
	}

	public BankAccount(String accountType, String customerName, String accountId) {
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}


	
}
