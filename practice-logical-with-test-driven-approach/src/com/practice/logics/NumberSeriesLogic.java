package com.practice.logics;

public class NumberSeriesLogic {
	
	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void printingLogic() {
		if(limit>0) {
			while(limit>0) {
				for(int j=limit;j<=limit+5;j++)
					System.out.println("No = "+j);
				limit=limit-10;
			}
		}
		else
			System.out.println("not able to proceed");
	}
	
}
