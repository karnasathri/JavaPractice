package com.Abstact;

public class Lenovo extends SampleABC {

	@Override
	public void cut() {
		System.out.println("Cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("keyboard code");
			
	}
	public  void copy() {
		System.out.println("Lenovo updated copy code");
	}

	public static void main(String[] args) {
		SampleABC lv = new Lenovo();
		lv.copy();
	}
}
