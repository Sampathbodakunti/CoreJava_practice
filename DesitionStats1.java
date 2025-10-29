//demonstration for disition making statements
package com.corejava.practice;
import java.util.Scanner;
public class DesitionStats1{

	public static void main(String[] args) {
		//		demo for if statement
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter your number:");
		int s=scanner.nextInt();
		if(s<0) {
			System.out.println("given number is negative ");
		}
		System.out.println("__________________________________");
		Test1();
		Test2();
	}



	public static void Test1() {
		//		demo for if-else statement
		Scanner marks=new Scanner(System.in);
		System.out.println("enter marks obtained");
		int SamMarks=marks.nextInt();
		if(SamMarks<40) {
			System.out.println("failed");
		}
		else {
			System.out.println("passed");
		}
		System.out.println("__________________________________");
	}
	public static void Test2() {
		//		demo for Nested-if statements
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the marks ");
		int marks =scan.nextInt();
		if(marks>40) {
			if(marks>60) {
				System.out.println("distinction");
			}
			else {
				System.out.println("first class");
			}
		}
		else {
			System.out.println("Fail");
		}
	}

}


