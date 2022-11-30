package com.veriables;

public class Bank {
	
	static int currentBalence = 1000;
	
	public static void greetCustomore() {
		System.out.println("Hello Welcome to the banking application");
	}
	
	public void deposite(int amount) {
		currentBalence = currentBalence + amount;
		System.out.println("amount deposited successfully");
		
	}
	
	public static void withdrowal(int amount) {
		currentBalence = currentBalence - amount;
		System.out.println("amount withdrowal successfully");
	}
	
	public int getCurrentBalence() {
		return currentBalence;
		
	}
	
	public static void main(String[] args) {
		greetCustomore();
		Bank bank = new Bank();
		System.out.println( "Current balence is : " + bank.getCurrentBalence());
		bank.deposite(500);
		System.out.println( "Current balence is : " + bank.getCurrentBalence());
		withdrowal(300);
		System.out.println( "Current balence is : " + bank.getCurrentBalence());

		
		
	}

}
