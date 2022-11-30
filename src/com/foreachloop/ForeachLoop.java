package com.foreachloop;

public class ForeachLoop {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for(int value : arr) {
//			System.out.print(value);
//		}
		int sum=0;
		for(int value : arr) {
			sum += value;
		}
		System.out.println(sum);
		System.out.println(sum/arr.length);
	}

}
