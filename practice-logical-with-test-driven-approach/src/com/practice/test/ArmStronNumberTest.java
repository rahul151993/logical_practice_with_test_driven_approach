package com.practice.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practice.logics.ArmStrongNumberLogic;

public class ArmStronNumberTest {
	
	private ArmStrongNumberLogic armStrongNumberLogic;
	
	@Before
	public void setTest() {
		armStrongNumberLogic = new ArmStrongNumberLogic();
	}
	
	@After
	public void unsetTest() {
		armStrongNumberLogic = null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
	@Test
	public void numberSeriesLogicTest1() {
		armStrongNumberLogic.setNo(371);
		MatcherAssert.assertThat(armStrongNumberLogic.isArmStrong(), is(equalTo(371)));
	}
	
	@Test
	public void numberSeriesLogicTest2() {
		armStrongNumberLogic.setNo(153);
		MatcherAssert.assertThat(armStrongNumberLogic.isArmStrong(), is(equalTo(153)));
	}
	
	@Test(expected = AssertionError.class)
	public void numberSeriesLogicTest3() {
		armStrongNumberLogic.setNo(153);
		MatcherAssert.assertThat(armStrongNumberLogic.isArmStrong(), is(equalTo(154)));
	}
	
	
	@Test
	public void numberSeriesLogicTest4() {
		armStrongNumberLogic.setNo(0);
		MatcherAssert.assertThat(armStrongNumberLogic.isArmStrong(), is(equalTo(0)));
	}
	
	@Test(expected = AssertionError.class)
	public void numberSeriesLogicTest5() {
		armStrongNumberLogic.setNo(159);
		MatcherAssert.assertThat(armStrongNumberLogic.isArmStrong(), is(equalTo(159)));
	}
}
