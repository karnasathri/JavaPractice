package com.String;

import java.util.Arrays;

public class SplitString {
	
	public static void main(String[] args) {
		String str1 = "Hello w^orld ho^w are y^ou";
		String str2 = "Hello";
		String str3 = "HELLO";
		String str4 = "Hello world how are you";
		
		System.out.println( Arrays.toString(str1.split(" "))); 
		//System.out.println( Arrays.toString(str4.split("^"))); 
		System.out.println( Arrays.toString(str1.split("\\^"))); 


	}

}
