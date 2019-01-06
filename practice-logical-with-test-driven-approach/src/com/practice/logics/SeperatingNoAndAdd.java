package com.practice.logics;

public class SeperatingNoAndAdd {
	
	private String src;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public int seperatingNoAndAdding() {
		String preProcessedString = src+" ";
		char seperatedChars[] = preProcessedString.toCharArray();
		return seperatingNoAndAddingLogic(seperatedChars);
	}

	private int seperatingNoAndAddingLogic(char[] seperatedChars) {
		int sum=0;
		String formedNo="";
		boolean isPreviousDigit = false;
		for(int i=0;i<seperatedChars.length;i++) {
			int asciiValue = (int)seperatedChars[i];
			if(asciiValue>=48 && asciiValue<=57) {
				formedNo=formedNo+seperatedChars[i];
				isPreviousDigit=true;
			}
			else if(isPreviousDigit==true) {
				isPreviousDigit=false;
				if(formedNo!="") {
					System.out.println(formedNo);
					sum=sum+(int)Integer.parseInt(formedNo);
					formedNo="";
				}
			}
		}
		return sum;
	}
}
