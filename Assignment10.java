package com.corejava.practice;

public class Assignment10 {

	public static void main(String[] args) {
		int i[]=new int[] {1,2,3,4,5};
		int sum=0;
		int x=0;
		while( x<i.length) {
			System.out.println(i[x]);
			sum=sum+i[x];
			x++;
		}System.out.println("sum of the array elements:"+sum);
		}

}
