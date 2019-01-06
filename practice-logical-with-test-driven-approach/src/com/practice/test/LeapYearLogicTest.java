package com.practice.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.LeapYearLogic;

public class LeapYearLogicTest {

private LeapYearLogic lYL;
	
	@Before
	public void setTest() {
		lYL = new LeapYearLogic();
	}
	
	@After
	public void unsetTest() {
		lYL =null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
		assertNotNull(lYL);
	}
	
	@Test
	public void checkLeapYear() {
		lYL.setYear(3300);
		MatcherAssert.assertThat(lYL.isLeapYear(), is(equalTo(false)));
	}
	
}
