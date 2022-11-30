package com.Inheritence;

public class User  {
	
	public static void main(String[] args) {
		
		Guest guest = new Guest();
		guest.read();
		
		Devoloper dev = new Devoloper();
		dev.read();
		dev.write();
		
		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();
		
	}

}
