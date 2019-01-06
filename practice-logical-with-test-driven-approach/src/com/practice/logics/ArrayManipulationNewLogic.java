package com.practice.logics;

public class ArrayManipulationNewLogic {
	
	public static void main(String[] args) {
		int[][] queries = {{3999,4000,3},{4000,4000,1}};
		int inputZeroArrayLength = 4000;
		long maxValue = arrayManipulation(inputZeroArrayLength,queries);
		System.out.println("");
		System.out.println("The max value is = "+maxValue);
		
	}

	private static long arrayManipulation(int n, int[][] queries) {
		int[] process = getZerosArray(n);
		int i = 0, maxValue = 0;
        while (i <queries.length) {
            int j = queries[i][0]-1;
            int value = queries[i][2];
            while (j < process.length && j <queries[i][1]) {
                process[j] = process[j] + value;
                if(process[j]>maxValue)
                	maxValue = process[j];
                j++;
            }
            i++;
        }
		return maxValue;
	}
	private static int[] getZerosArray(int n) {
		int processing [] = new int[n];
		for(int i=0;i<processing.length;i++) {
			processing[i] = i-i;
		}
		return processing;
	}
}
