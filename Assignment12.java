package com.corejava.practice;

import java.util.Arrays;

public class Assignment12 {

	public static void main(String[] args) {
		String i[]= {"chai","coffee"};
		String j[]= {"milk","water","coke"};
		System.out.println(Arrays.toString(i)+Arrays.toString(j));
		String[] k= {i[0],i[1],j[0],j[1],j[2]};
		System.out.println(Arrays.toString(k));
	}
}
