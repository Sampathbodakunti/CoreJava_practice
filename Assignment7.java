//printing prime numbers between 50-150
package com.corejava.practice;
import java.util.Scanner;
public class Assignment7 {
	public static void main(String[] args) {Scanner Scanner = new Scanner(System.in);

    System.out.println("Enter the starting number: ");
    int number = Scanner.nextInt();

    System.out.println("Enter the ending number: ");
    int EndNumber = Scanner.nextInt();

    if (number > EndNumber) {
        System.out.println("Invalid range! Starting number must be less than ending number.");
    } else {
        System.out.println("Prime numbers between " + number + " and " + EndNumber + " are:");


        while (number <= EndNumber) { 
            boolean isprime = true; // reset for every number

            if (number <= 1) {
                isprime = false;
            } else {
                int i = 2;
                while (i <= number /2) {
                    if (number % i == 0) {
                        isprime = false;
                        break;
                    }
                    i++;
                }
            }

            if (isprime) {
                System.out.println(number);
            }

            number++; // move to next number
        }
    }
}
}
