//demonstration for giving user input from console 

package com.corejava.practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");		
		String name = scanner.nextLine();
		System.out.printf("hello %s\n",name); 
		System.out.println("enter your age");
		int age=scanner.nextInt();
		System.out.println("enter your CGPA  ");
		float percentage=scanner.nextFloat();
		System.out.println("Thankyou");
	}
}
