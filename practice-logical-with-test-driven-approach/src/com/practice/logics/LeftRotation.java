package com.practice.logics;

import java.util.ArrayList;

public class LeftRotation {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[]=rotLeft(a,1);
		for(int no:b) {
			System.out.println(no+" ");
		}
	}

	private static int[] rotLeft(int[] a, int d) {
		ArrayList<Integer> noList = new ArrayList<>(); 
		for(int i=0;i<d;i++) {
			noList.add(a[i]);
		}
		System.out.println(noList);
		int j=noList.size(),index=0;
		System.out.println("size  = "+j);
		int count = 0;
		while(j<a.length) {
			a[index] = a[j];
			a[j]=0;
			index++;
			j++;
			count++;
		}
		System.out.println("count is = "+count);
		int indexForList = 0;
		for(int i=count;i<a.length;i++) {
			a[i]=noList.get(indexForList);
			indexForList++;
		}
		return a;
	}
}
