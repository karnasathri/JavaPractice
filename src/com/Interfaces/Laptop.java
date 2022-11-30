package com.Interfaces;

public interface Laptop {
	
	public  void copy();
		
	
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		//audio();
		commancode();
		System.out.println("please implement");
	}
	
	static void audio() {
		
		System.out.println("Implement audio");
	}
	
	private void commancode() {
		System.out.println("Comman code");
	}


}
