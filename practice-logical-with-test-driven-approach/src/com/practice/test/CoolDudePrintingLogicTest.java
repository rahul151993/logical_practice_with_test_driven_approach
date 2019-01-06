package com.practice.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.CoolDudePrintingLogic;

public class CoolDudePrintingLogicTest {
	
	private CoolDudePrintingLogic coolDudePrintingLogic;
	
	@Before
	public void setThings() {
		coolDudePrintingLogic = new CoolDudePrintingLogic();
	}
	
	@After
	public void unsetThings() {
		coolDudePrintingLogic = null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
	@Test
	public void coolDudePrintingTest1() {
		coolDudePrintingLogic.setLimit(500);
		coolDudePrintingLogic.printingLogic();
	}
	@Test
	public void coolDudePrintingTest2() {
		coolDudePrintingLogic.setLimit(0);
		coolDudePrintingLogic.printingLogic();
	}
}
