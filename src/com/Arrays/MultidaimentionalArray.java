package com.Arrays;

public class MultidaimentionalArray {
	
	public static void main(String[] args) {
		int [][] arr= new int[3][2];
		arr[0][0] =1;
		arr[0][1] =2;
	
		arr[1][0] =3;
		arr[1][1] =4;
		
		arr[2][0] =5;
		arr[2][1] =6;
		
		arr[2][0] =7;
		arr[2][1] =8;
		
//		arr[2][0] =9;
//		arr[2][1] =10;
		
//		arr[2][0] =11;
//		arr[2][1] =12;
		
	for(int i = 0; i<arr.length; i++) {
		System.out.println(arr[i]);
		int[] singleRow = arr[i];
		for(int j= 0; j<singleRow.length; j++) {
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
		
	}

}
