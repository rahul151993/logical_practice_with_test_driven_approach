package com.practice.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.Reminder3Logic;

public class Reminder3LogicTest {
	
	private Reminder3Logic reminderLogic;
	
	@Before
	public void setTest() {
		reminderLogic = new Reminder3Logic();
	}
	
	@After
	public void unsetTest() {
		reminderLogic = null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
	@Test
	public void numberSeriesLogicTest1() {
		reminderLogic.setLimit(100);
		reminderLogic.printingLogic();
	}
	
	@Test
	public void numberSeriesLogicTest2() {
		reminderLogic.setLimit(0);
		reminderLogic.printingLogic();
	}
}
