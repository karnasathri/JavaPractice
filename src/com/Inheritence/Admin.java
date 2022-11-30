package com.Inheritence;

public class Admin extends Devoloper {
	
	public void manage() {
		super.read();
		write();
		System.out.println("Manage code");
	}
	
	public void read() {
		System.out.println("Admin read code");
	}

}
