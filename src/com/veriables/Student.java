package com.veriables;

public class Student {
	static int id = 500;
	String name = "Karna";
	
	public static void main(String[] args) {
		//Student student = new Student();
		System.out.println(id);
		System.out.println(new Student().name);
		test1(70);
		test1(id);
		
	}
	
	public static void test1(int hight) {
		
		hight=50;
		System.out.println(hight);
	}

}
