package com.practice.logics;

public class ChaoticSolutionLogicWithAnotherLogic {
	public static void main(String[] args) {
		int input[]= {2,1,5,3,4};
		minimumBribes(input);
	}

	private static void minimumBribes(int[] q) {
		int processing[] = getProcessingArray(q.length);
		boolean chaoticState = isChaotic(q);
		int count = 0;
			if(chaoticState) {
				for(int i=0;i<q.length;i++) {
					if(q[i]!=processing[i]) {
						int pos=0,j=0;
						if(q[i]==processing[i+1])
							pos=i+1;
						else if(q[i]==processing[i+2])
							pos=i+2;
						while(j<2) {
							if(pos-1>=0) {
								int temp=processing[pos-1];
								processing[pos-1]=processing[pos];
								processing[pos]=temp;
								pos--;
								count++;
							}
							j++;
							if(q[i]==processing[i])
								break;
						}
					}
				}
				System.out.println(count);
		    }
		
		/*for(int i=0;i<processing.length;i++) {
			System.out.print(processing[i]+" ");
		}*/		
	}
	
	private static boolean isChaotic(int[] q) {
		boolean isChaotic = true;
		for(int i=0;i<q.length;i++) {
			if((q[i]-i)>3) {
				/*System.out.println("The value is input["+i+"] = "+input[i]+" and difference is = "+(input[i]-i));*/
				System.out.println("Too chaotic");
				isChaotic=false;
				break;
			}
		}
		return isChaotic;
	}

	private static int[] getProcessingArray(int length) {
		int p[]= new int[length];
		for(int i=0;i<length;i++) {
			p[i] = i+1;
		}
		return p;
	}
}
