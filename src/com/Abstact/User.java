package com.Abstact;

public class User {
	
	public static void main(String[] args) {
	SampleABC lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.paste();
		//lenovo.capture();
		//lenovo.security();
		//lenovo.audio();
	    //Laptop.audio();
		System.out.println();
		
		HP hp = new HP();
		hp.printing();
		
		Lenovo.move();
		
		ExtendedLenovo el = new ExtendedLenovo();
		el.copy();
	}

}
