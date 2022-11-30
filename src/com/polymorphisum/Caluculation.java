package com.polymorphisum;

public class Caluculation {
	
	public void add(int a, int b) {
		//add method code
		System.out.println("Added two numbers");
		
	}
	
	public void add(int a, int b, int c) {
		//add method code
		a=10;
		b=20;
		c=30;
		
		System.out.println("Added three numbers");
		System.out.println(a+b*c);
		System.out.println(b);
		System.out.println(c);



		
	}
	
	public static void main(String[] args) {
		Caluculation cl = new Caluculation();
		cl.add(0, 0);
		cl.add(0, 0, 0);
	}

}
