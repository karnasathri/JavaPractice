package com.exceptionHandling;

//import java.nio.file.Files.AcceptAllFilter;

public class Programme {
	
	public static void main(String[] args) {
		method2();

	}
	
	public static void method2() {
		method1();
	}
	 
	//Stack trace
	//1. Exception name -  java.lang.ArithmeticException
	//2. Exception massage - / by zero
	//3. Which line number
	//4. Methods information
	
	public static void method1() {
		
		
		
		System.out.println("Program excution start");
		
		int fNumber = 8;
		int snumber = 0;
		int result = 0;
		
		try {
			result = fNumber/snumber;
		}
		
		catch(ArithmeticException Ae){
			//System.out.println(Ae.toString());//write a logic to enter this massage into log files
			System.out.println(Ae.getMessage());
			throw Ae;
			
		}		
		finally {
			System.out.println("Finally block");
		}

		//result = fNumber/snumber;

		System.out.println("out put is "+ result);
		System.out.println("programe excution end");
		
        //static final Programme FILTER = new Programme();

		
		
		
	}

}
