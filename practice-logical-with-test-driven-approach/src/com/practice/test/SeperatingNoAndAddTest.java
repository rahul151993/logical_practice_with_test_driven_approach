package com.practice.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.SeperatingNoAndAdd;

public class SeperatingNoAndAddTest {
	
	private SeperatingNoAndAdd sNA;
	
	@Before
	public void setTest() {
		sNA = new SeperatingNoAndAdd();
	}
	
	@After
	public void unsetTest() {
		sNA =null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
		assertNotNull(sNA);
	}
	
	@Test
	public void seperatingNoandAddingTest1() {
		sNA.setSrc("out of 10 peoples only 6 are male and 4 are females");
		MatcherAssert.assertThat(sNA.seperatingNoAndAdding(),is(equalTo(20)));
	}
	
	@Test
	public void seperatingNoandAddingTest2() {
		sNA.setSrc("5 out of 12 are failed");
		MatcherAssert.assertThat(sNA.seperatingNoAndAdding(),is(equalTo(17)));
	}
	
	@Test
	public void seperatingNoandAddingTest3() {
		sNA.setSrc("1kill count is 10 out of 20c4v5v6");
		MatcherAssert.assertThat(sNA.seperatingNoAndAdding(),is(equalTo(46)));
	}
}
