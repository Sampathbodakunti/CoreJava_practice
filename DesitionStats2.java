package com.corejava.practice;

import java.util.Scanner;

public class DesitionStats2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the i value");
		int i=scanner.nextInt();
		switch(i) {
		case 1:
			System.out.println("given value is one");
			break;
		case 2:
			System.out.println("given value is two");
			break;
		case 3:
			System.out.println("given value is three");
			break;
		case 4:
			System.out.println("given value is four");
			break;
		case 5:
			System.out.println("given value is five");
			break;
			default:
				System.out.println("given value is out of range");
		}
		
	}

}
