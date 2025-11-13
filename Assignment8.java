package com.corejava.practice;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enther the starting number");
		int Startnumber=scanner.nextInt();
		System.out.println("Enther the end number");
		int Endnumber=scanner.nextInt();
		int sum=0;
		while(Startnumber<=Endnumber) {
			if(Startnumber%2==0) {
//				System.out.println(Startnumber);
				sum=sum+Startnumber;
				
			
			}Startnumber++;
			
		}System.out.println("sum of even numbers between "+Startnumber+" and "+Endnumber+" is: "+sum);
		
	}

}
