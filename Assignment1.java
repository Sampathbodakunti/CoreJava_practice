package com.corejava.practice;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the i value");
		int i=scanner.nextInt();
		switch(i%2) {
		case 0:
			System.out.println(" given number is even");
			break;
		case 1:
			System.out.println(" given number is odd");
			break;
		default:
			System.out.println("given value is out of range");
		}
	}

}
