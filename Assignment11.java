package com.corejava.practice;

public class Assignment11 {

	public static void main(String[] args) {
		int[] i = new int[] {2,5,3,9,6};
		int sum=0;
		int x=0;
		int avg=0;
		while(x<i.length) {
			
			sum=i[x]+sum;
			x++;
			 avg=sum/i.length;
		}System.out.println("Average of array elements: "+avg);
	}

}
