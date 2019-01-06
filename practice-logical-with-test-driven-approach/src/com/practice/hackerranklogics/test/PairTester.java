package com.practice.hackerranklogics.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class PairTester{	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
/*	@Test
	public void pairTest1() {
		int[] process = {1,2,1,2,1,3,2};
		int[] flagger = new int[process.length];
		MatcherAssert.assertThat(getPairs(process,flagger),is(equalTo(2)));
	}
	
	@Test
	public void pairTest2() {
		int[] process = {10,20,20,10,10,30,50,10,20};
		int[] flagger = new int[process.length];
		MatcherAssert.assertThat(getPairs(process,flagger),is(equalTo(3)));
	}*/
	
	@Test
	public void pairTest3() {
		int[] process = {5,6,5,6,5,6,5,6,5,5,6,6,8,9,8};
		int[] flagger = new int[process.length];
		MatcherAssert.assertThat(getPairs(process,flagger),is(equalTo(7)));
	}

	private int getPairs(int[] process, int[] flagger) {
		int sum=0;
		for(int i=0;i<process.length;i++) {
			int count=0;
			if(flagger[i]!=1) {
				for(int j=i;j<process.length;j++) {
					if(process[i]==process[j]) {
						count++;
						flagger[j]=1;
					}
				}
			}
			flagger[i]=1;
			sum=sum+(int)count/2;
		}
		return sum;
	}
}
