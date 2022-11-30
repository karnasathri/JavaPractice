package com.Interfaces;

public class User {
	
	public static void main(String[] args) {
		Laptop lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		//lenovo.capture();
		lenovo.security();
		//lenovo.audio();
	    Laptop.audio();
		System.out.println();
		
		HP hp = new HP();
		hp.printing();
		hp.security();
		
		Apple aple = new Apple();
		aple.security();
		//Laptop.audio();
	}

}
