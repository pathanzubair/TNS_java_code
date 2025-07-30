package com.BTS;

public class Main {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		
		
		SavingsAccount s1 = new SavingsAccount(123456,0.0);
		
		CheckingAccount c1 = new CheckingAccount(365214,0.0);
		
		
		s1.deposit(30000);
		s1.getBalance();
		s1.withdraw(100);
		s1.getBalance();
		
		c1.deposit(23000);
		c1.getBalance();
		c1.withdraw(1020);
		c1.getBalance();
		
		Transaction t1 = new Transaction();
		
		t1.performTransaction(s1, c1, 256);
		
		
		
		
		System.out.println("Total bank accounts : "+Bank.getTotalAccounts());

	}

}
