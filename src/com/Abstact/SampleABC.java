package com.Abstact;

public abstract class SampleABC implements Laptop {
	
	public  void copy() {
		System.out.println("Lenovo copy code");
	}

	
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}
	
	public static void move() {
		System.out.println("Lenovo move code");
		
	}
	
    public abstract void cut();
	
	public abstract void keyboard(); 

}
