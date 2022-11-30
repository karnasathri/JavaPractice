package com.Inheritence;

import com.Accessmodifiers.Student;

public class Subclass extends Student {
	
	public static void main(String[] args) {
		new Subclass().test();
	}
	
	public void test() {
		System.out.println(rollNo);
		printRollNo();
	}

}
