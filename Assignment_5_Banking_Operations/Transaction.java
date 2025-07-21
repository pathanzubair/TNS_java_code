package com.BTS;

public class Transaction {
	
	final double transactionFee=5.0;
	
	public final void performTransaction(Account sender,Account receiver,double amount) {
		
		System.out.println("Transaction Started !!!");
		
		if(sender.balance>=(amount+transactionFee)) {
			sender.withdraw(amount+transactionFee);
			receiver.deposit(amount);
			System.out.println("Transaction completed with Transaction Fee :"+transactionFee);
			sender.getBalance();
			receiver.getBalance();
			System.out.println();
		}
		else {
			System.out.println("Insufficients funds to transfer !!");
			System.out.println();
		}
	}

}
