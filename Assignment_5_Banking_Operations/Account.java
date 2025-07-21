package com.BTS;

public abstract class Account {
	
	protected long accNumber;
	protected double balance;
	
	public Account(long accNumber, double balance) {
		
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	public abstract void deposit(double amt);
	
	public abstract void withdraw(double amt);
	
	public abstract void getBalance();
	
	

}
