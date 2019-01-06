package com.practice.logics;

public class FindSecondMinimum {
	
	private int[] nos;

	public int[] getNos() {
		return nos;
	}

	public void setNos(int[] nos) {
		this.nos = nos;
	}

	public int findSecondMinimum() {
		int min=nos[0];
		int minDiff =nos[0];
		for(int i=0;i<nos.length;i++) {
			if(min>nos[i]) {
				minDiff = min-nos[i];
				min = nos[i];
				System.out.println("min = "+min+", mindifference = "+minDiff);

			}
			/*else {
				if((min-nos[i])<minDiff && min!=nos[i]) {
					minDiff = nos[i]-min;
				}
			}*/
		}
		int secondMin = min+minDiff;
		return secondMin;
	}

}
