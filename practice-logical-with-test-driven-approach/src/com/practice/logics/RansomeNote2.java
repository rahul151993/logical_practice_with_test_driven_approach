package com.practice.logics;

import java.util.logging.Logger;

public class RansomeNote2 {
	private static final Logger LOGGER = Logger.getLogger("RansomeNote");
	public static void main(String[] args) {
		String[] magazine= {"apgo","clm","w"};
		String[] note = {"apgo","apgo","apgo"};
		checkMagazine(magazine,note);
	}
	/*private static LinkedHashMap<String, Integer> getLinkedHashMap(String[] str) {
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap();
		int[] fs = new int[str.length];
		for(int i=0;i<str.length;i++) {
			int count=0;
			if(fs[i]!=1) {
				for(int j=0;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						fs[j]=1;
						count++;
					}
				}
				lhm.put(str[i],count);
			}
			
		}

		return lhm;
	}*/
	private static void checkMagazine(String[] magazine, String[] note) {
		int cnt=0,sameTM=0;
		String noteFirst = note[0];
		for(int i=0;i<note.length;i++) {
			if(noteFirst.equals(note[i]))
				sameTM++;
		}
		if(magazine.length==sameTM) {
			System.out.println("No");
		}
		else {
			for(int i=0;i<note.length;i++) {
				for(int j=0;j<magazine.length;j++) {
					if(magazine[j]!=null && note[i].equals(magazine[j])) {
						note[i]=null;
						magazine[j]=null;
						cnt++;
						break;
					}
				}
			}
			if(cnt==note.length) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
