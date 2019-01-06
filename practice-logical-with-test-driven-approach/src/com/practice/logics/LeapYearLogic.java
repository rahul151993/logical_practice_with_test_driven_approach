package com.practice.logics;

public class LeapYearLogic {
	
	private int year;
	

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isLeapYear() {
		boolean isLeap = false;
		if(year%100==0) {
			if(year%400==0)
				isLeap=true;
		}
		else {
			if(year%4==0)
				isLeap=true;
		}
		return isLeap;
	}
}
