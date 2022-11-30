package com.veriables;

import java.util.Scanner;

public class UserInputs {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("what your name");
		String name = scanner.nextLine();
		System.out.printf("Hey %s , how are you? \n" , name);
		String status = scanner.nextLine();
		System.out.printf("your age is %d right ", status);
		int age = scanner.nextInt();
		System.out.println("Thank you for the information");
		scanner.close();
		
	}

}
