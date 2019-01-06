package com.practice.logics;

public class RF {
	
	public static void main(String[] args) {
		long count = repeatedString("aba",14);
		System.out.println(count);
	}

	private static long repeatedString(String s, long n) {
		 long division = (long)n/s.length();
	       long reminder = (long)n%s.length();
	       char srcArray[] = s.toCharArray();
	       long mainCount = findCount(srcArray,srcArray.length);
	       long count=0;
	       if(reminder!=0){
	           count = findCount(srcArray, reminder);
	       }
	       long maxMultipleCount = mainCount*division;
	       maxMultipleCount=maxMultipleCount+count;
		return maxMultipleCount;
	}

	private static long findCount(char[] srcArray, long length) {
		long cnt=0;
		for(int i=0;i<length;i++) {
			if(srcArray[i]=='a' || srcArray[i]=='A') {
				cnt++;
			}
		}
		return cnt;
	}

}
