package com.practice.logics;

public class ChaoticSolutionLogic {
	public static void main(String[] args) {
		int input[]= {2,5,1,3,4};
		minimumBribes(input);
	}

	private static void minimumBribes(int[] q) {
		int processing[] = getProcessingArray(q.length);
		boolean chaoticState = isChaotic(q);
		int count = 0;
		if(chaoticState) {
		for(int i=0;i<q.length;i++) {
			for(int j=0;j<processing.length;j++) {
				if(q[i]==processing[j]) {
					if(i!=j) {
						int diff=Math.abs(i-j);
						if(diff<=2) {
							int k=0,pos=j;
							while(k<diff) {
								if(pos-1>=0) {
									int temp = processing[pos-1];
									processing[pos-1]=processing[pos];
									processing[pos] = temp;
									pos--;
									count++;
								}
								k++;
							}
						}
					}
					break;
				}
			}
		}
		System.out.println(count);
	}
		
		/*for(int i=0;i<processing.length;i++) {
			System.out.print(processing[i]+" ");
		}	*/	
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
