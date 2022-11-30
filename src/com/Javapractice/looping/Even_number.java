package com.Javapractice.looping;

public class Even_number {
	//int m=100, n=200;
	public static void main(String[] args) {
		int m=15, n=75;
		//int start =2;
		for(int i=n; i>=m; --i) {
			if(i%2 !=0) {
				//i--;
				System.out.println(i);
				i--;
			}
		}
	}

}
