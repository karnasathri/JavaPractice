package com.Javapractice.looping;

public class ForLoop {
	public static void main(String[] args) {
		int i;
		for(i=1; ; ) {
			if(i<=50) {
			//i++;
			//i++;
			//i*=2;
			System.out.println(i);
			i*=2;
			}
			else
				break;
		}
		System.out.println(i);
		
	}

}
