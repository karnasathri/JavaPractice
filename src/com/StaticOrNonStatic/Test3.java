package com.StaticOrNonStatic;

public class Test3 {
	static int number;
	static {
		System.out.println("Static block");
		number=20;
	}
	
	{
		System.out.println("Non-Static block");

	}
	public Test3() {
		System.out.println("This is constructer");
		//number=10;

	}
	public static void main(String[] args) {
		//System.out.println("This is main method");
		Test3 t3 = new Test3();
		System.out.println(Test3.number);

		
	}

}
