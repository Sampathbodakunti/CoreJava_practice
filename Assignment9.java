package com.corejava.practice;

public class Assignment9 {

	public static void main(String[] args) {
		int i =200;
		int j=25;
		int sum=0;
		System.out.println("even numbers between 200-25 are: ");
		while(i>j) {
			if(i%2!=0) {
				System.out.println(i);
				sum=sum+i;
				}i--;
			}System.out.println("Sum is:"+sum);
	}

}
