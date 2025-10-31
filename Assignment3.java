package com.corejava.practice;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Day");
		String Day=scanner.next();
		switch (Day) {
		case"sunday","satday":
			System.out.println("Yayy,its a weak end");
		break;
		case "monday","tuesday","wedday","thursday","friday":
			System.out.println("uff, its a weak day");
		break;

		}
	}

}
