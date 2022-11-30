package com.Arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
		int[][] arr= new int[3][15];
		arr[0] = new int[15] ;
		arr[1] = new int[] {1,12,13,14,15,99,88,77,66,};
		arr[2] = new int[] {9,8,7,11,22,33,44,55} ;
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 100;
		arr[1][1] = 99;
		arr[1][2] = 88;
		arr[1][3] = 77;
		arr[1][4] = 66;
		
		arr[2][0] = 1;
		arr[2][1] = 2;
		arr[2][2] = 1;
		
		for(int i = 0; i<arr.length; i++) {
			//size += arr[i].length;
			int[] singleRow = arr[i];
			for(int j= 0; j<singleRow.length; j++) {
			System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
