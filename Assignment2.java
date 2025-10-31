package com.corejava.practice;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first operend");
		int s=scanner.nextInt();
		System.out.println("Enter the second operend");
		int m=scanner.nextInt();
		System.out.println("enter the operator");
		char operator=scanner.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result=s+m;
			System.out.println("Result="+result);
			break;
		case'-':
			result=s-m;
			System.out.println("Result="+result);
			break;
		case '*':
			result=s*m;
			System.out.println("Result="+result);
			break;
		case '/':
			result=s/m;
			System.out.println("Result="+result);
			break;
		case '%':
			result=s/m;
			System.out.println("Result="+result);
			break;
			default:
				System.out.println("unappropriate operation");
		}
	}

}
