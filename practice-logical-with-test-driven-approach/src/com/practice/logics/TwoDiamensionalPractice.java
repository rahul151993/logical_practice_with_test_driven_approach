package com.practice.logics;

public class TwoDiamensionalPractice {
	public static void main(String[] args) {
		int row=6,col=6;
		int[][] data = {{0,-4,-6,0,-7,-6},{-1,-2,-6,-8,-3,-1},{-8,-4,-2,-8,-8,-6},{-3,-1,-2,-5,-7,-4},{-3,-5,-3,-6,-6,-6},{-3,-6,0,-8,-6,-7}};
		//data = insertData(data,row,col);
		//printingData(data,row,col);
		int maxSum=findSubMatricesMaximumSum(data,row,col);
		System.out.println("Tha maximum sum is = "+maxSum);
	}

	private static int findSubMatricesMaximumSum(int[][] data, int row, int col) {
		int i=0,j=0,sum=0,maxSum=Integer.MIN_VALUE;
		int[][] processor = new int[3][3];
		while(i<row) {
			j=0;
			while(j<col) {
				if(i+2<row && j+2<col) {
					sum=0;
					int m=0,n=0;
					for(int k=i;k<=i+2;k++) {
						n=0;
						for(int l=j;l<=j+2;l++) {
							System.out.print(data[k][l]+" ");
							processor[m][n]=data[k][l];
							n++;
						}
						System.out.println();
						m++;
					}
					sum=findSum(processor,m,n);
					System.out.println("The sum is  = "+sum);
					if(sum>maxSum) {
						maxSum =sum;
					}
				}
				j++;
			}
			i++;
		}
		return maxSum;
	}

	private static int findSum(int[][] processor, int m, int n) {
		
		int sum = 0;
		for(int o=0;o<m;o++) {
			for(int p=0;p<n;p++) {
				if((o==1 && p==0)||(o==1 && p==2)) {
					System.out.print(processor[o][p]+" ");
				}
				else {
					sum=sum+processor[o][p];
				}
				
			}
			System.out.println();
		}
		return sum;
	}

	private static void printingData(int[][] data, int row, int col) {
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] insertData(int[][] data, int row, int col) {
		int value=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(value>9)
					value=0;
				data[i][j]=value;
				value++;
			}
		}
		return data;
	}
}
