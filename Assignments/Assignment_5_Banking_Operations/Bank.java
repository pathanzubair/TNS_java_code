package com.BTS;

public class Bank {
	
	protected static int totalAccounts=0;
	
	public Bank() {
		totalAccounts++;
		
	}

	static int getTotalAccounts() {
		return totalAccounts;
		
	}
	
	

}
