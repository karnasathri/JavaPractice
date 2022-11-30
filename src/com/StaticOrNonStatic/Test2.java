package com.StaticOrNonStatic;

public class Test2 {
	//int number;
	public static void main(String[] args) {
		//System.out.println(Test1.number);
		Test1.print();
		Test1 t1 = new Test1();
		t1.print1();
		//System.out.println(t1);
	}

}
