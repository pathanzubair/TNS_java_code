package com.BTS;

public class CheckingAccount extends Account{

	public CheckingAccount(long accNumber, double balance) {
		super(accNumber, balance);
	}

	@Override
	public void deposit(double amt) {
		if(amt<0) {
			System.out.println("Amount cannot be Negative");
			System.out.println();
		}else{
			balance+=amt;
			System.out.println("Deposited to Checkings : "+amt);
			System.out.println();
		}
		
		
	}

	@Override
	public void withdraw(double amt) {
		if(amt<0) {
			System.out.println("Amount cannot be Negative");
			System.out.println();
		}else if(amt>balance){
			System.out.println("Not sufficient balance in Checkings ");
			System.out.println();
		}
		else {
			balance-=amt;
			System.out.println("Amount withdrawn from checkings: "+amt);
			System.out.println();
			
		}
		
	}

	@Override
	public void getBalance() {
		System.out.println("Available Balance in checkings : "+balance);
		System.out.println();
		
	}


}
