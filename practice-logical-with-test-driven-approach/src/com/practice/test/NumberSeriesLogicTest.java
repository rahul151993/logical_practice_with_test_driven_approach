package com.practice.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.NumberSeriesLogic;

public class NumberSeriesLogicTest {
	
	private NumberSeriesLogic numberSeriesLogic;
	
	@Before
	public void setTest() {
		numberSeriesLogic = new NumberSeriesLogic();
	}
	
	@After
	public void unsetTest() {
		numberSeriesLogic = null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
	@Test
	public void numberSeriesLogicTest1() {
		numberSeriesLogic.setLimit(100);
		numberSeriesLogic.printingLogic();
	}
	
	@Test
	public void numberSeriesLogicTest2() {
		numberSeriesLogic.setLimit(0);
		numberSeriesLogic.printingLogic();
	}
}
