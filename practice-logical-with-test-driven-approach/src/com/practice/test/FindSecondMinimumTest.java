package com.practice.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.FindSecondMinimum;

public class FindSecondMinimumTest {
	
private FindSecondMinimum fSM;
	
	@Before
	public void setTest() {
		fSM = new FindSecondMinimum();
	}
	
	@After
	public void unsetTest() {
		fSM =null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
		assertNotNull(fSM);
	}
	
	@Test
	public void findSecondMinimumTest1() {
		int[] nos = {10,5,7,3,8,1};
		fSM.setNos(nos);
		MatcherAssert.assertThat(fSM.findSecondMinimum(),is(equalTo(3)));
	}
	
	@Test
	public void findSecondMinimumTest2() {
		int[] nos = {103,401,226,546,102,104};
		fSM.setNos(nos);
		MatcherAssert.assertThat(fSM.findSecondMinimum(),is(equalTo(103)));
	}
	
	@Test
	public void findSecondMinimumTest3() {
		int[] nos = {12546,22125,75458,12463,21254,12345,22150,2};
		fSM.setNos(nos);
		MatcherAssert.assertThat(fSM.findSecondMinimum(),is(equalTo(12345)));
	}
	
	
	@Test
	public void findSecondMinimumTest4() {
		int[] nos = {1,2,3,4,5,6,7,8,9};
		fSM.setNos(nos);
		MatcherAssert.assertThat(fSM.findSecondMinimum(),is(equalTo(2)));
	}
	
	
	
	
}
