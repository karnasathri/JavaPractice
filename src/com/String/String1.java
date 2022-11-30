package com.String;

public class String1 {
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str4 = new String("hello");
		String str3 = "Hello";
//		System.out.println(str1==str2);//Data store address verifying
//		System.out.println(str1==str3);
//		System.out.println(str2==str4);
		System.out.println(str1.equals(str2));// Text data verifying
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str1));
	}

}
