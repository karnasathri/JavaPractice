package com.veriables;

public class SwichCondition {
	
	public static void main(String[] args) {
	    
		int i = 2;
		int j = 10;
		switch(i) {
		
		case 1:
			System.out.println(" This is the first statement");
			
		case 3:
			System.out.println(" This is the second statement");
			
		case 4:
			System.out.println(" This is the third statement");
			
		case 2:
			System.out.println(" This is the 4 statement"); 
			
			default:
				System.out.println(" This is default ststement");
		}
		
		switch(j) {
		case 0:
			System.out.println(" This value not eual to ten");
			
			
		case 10:
			System.out.println(" This value eual to ten");
		case 1:
			System.out.println(" This value not eual to ten");
		case 2:
			System.out.println(" This value not eual to ten");
		case 3:
			System.out.println(" This value not eual to ten");
		case 4:
			System.out.println(" This value not eual to ten");
		case 5:
			System.out.println(" This value not eual to ten");
		case 100:
			System.out.println(" This value not eual to ten");
		}
		
	}

}
