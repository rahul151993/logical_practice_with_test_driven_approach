package com.practice.logics;

public class MinimumSwap {
	private static int minimumSwap(int[] arr){
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int j=i;
			while(arr[j]-1!=j) {
				int swapIndex = arr[j]-1;
				int temp = arr[swapIndex];
				arr[swapIndex] = arr[j];
				arr[j] = temp;
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		return count;
	}
	public static void main(String[] args) {
		int input[]= {7,1,3,2,4,5,6};
		System.out.println("The max swap count is = "+minimumSwap(input));
		
	}
}
