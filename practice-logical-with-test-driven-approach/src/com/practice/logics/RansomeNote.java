package com.practice.logics;

import java.util.LinkedHashMap;
import java.util.logging.Logger;

public class RansomeNote {
	private static final Logger LOGGER = Logger.getLogger("RansomeNote");
	public static void main(String[] args) {
		String[] magazine= {"ive","ive","got","lovely","bunch","of","coconuts"};
		String[] note = {"ive","ive","ive"};
		checkMagazine(magazine,note);
	}
	private static LinkedHashMap<String, Integer> getLinkedHashMap(String[] str) {
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
	}
	private static void checkMagazine(String[] magazine, String[] note) {
		int match=0;
		if(magazine.length>=note.length) {
			LinkedHashMap<String,Integer> lhmm = getLinkedHashMap(magazine);
			//System.out.println(lhmm);
			for(int i=0;i<note.length;i++) {
				if(lhmm.containsKey(note[i]) && lhmm.get(note[i])>0) {
					//System.out.println(" key  = "+note[i]+" value = "+lhmm.get(note[i]));
					lhmm.replace(note[i],lhmm.get(note[i])-1);
					match++;
				}
			}
			if(match==note.length) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else 
			System.out.println("No");
	}
}
