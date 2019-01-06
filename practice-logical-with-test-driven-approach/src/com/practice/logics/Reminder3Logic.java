package com.practice.logics;

public class Reminder3Logic {

	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void printingLogic() {
		if(limit>0) {
			for(int i=1;i<=limit;i++) {
				if(i%7==3)
				System.out.println("no is = "+i);
			}
		}
		else {
			 System.out.println("Bye!----");
			 System.exit(0);
		}
	}
	
	
}
