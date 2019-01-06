package com.practice.logics;

public class SampleArrayOperation {
	public static void main(String[] args) {
		int q[]= {1,2,5,3,7,8,6,4};
		minimumBribes(q);
	}
	private static void minimumBribes(int[] q) {
		int processing[] = getProcessingArray(q.length);
		for(int i=0;i<q.length;i++) {
			System.out.println(fastSearch(processing,q[i]));
		}
		
	}
	private static int fastSearch(int[] processing,int value) {
		int result = 0;
		for(int i=0;i<processing.length;i++) {
			int j=0,rear=(processing.length-1),front=0;
			while(front<=rear) {
				if(processing[front]==value) {
					return front;
				}
				else if(processing[rear]==value) {
					return rear;
				}
				front++;
				rear--;
			}
		}
		return result;
	}
	private static int[] getProcessingArray(int length) {
		int p[]= new int[length];
		for(int i=0;i<length;i++) {
			p[i] = i+1;
		}
		return p;
	}

}
