package com.veriables;

public class Netedif {
   
	public static void main(String[] args) {
		String examStatus = "Pass";
		
		if(examStatus == "Pass") {
			System.out.println(" Wait for furdar rounds");
			String round1Status = "Pass";
			if(round1Status == "Pass") {
				System.out.println(" you have cleard the 1st round and wait for the second round");  
				String round2Status = "Pass";
				if(round2Status == "Pass") {
					System.out.println(" you have cleard the 2nd round and wait for the HR round");   	
				}
				else {
					System.out.println(" You con go to home");
				}
			}
			else {
				System.out.println(" You con go to home");
			}
		}
		else {
			System.out.println(" You con go to home");
		}
		
	}
}
