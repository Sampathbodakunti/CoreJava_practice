package com.corejava.practice;
//variables in java

public class Student {
	int id=110;                       //instance variable(global var)
	static String name="sampath";     //class variable(global var)
	public static void main(String[] args){
		Student student= new Student();
		System.out.println(student.id);
		test1();
		test2();
		test3(70);
		}
	public static void test1() {
		System.out.println(name);
		}
	public static void test2() {
		int rollno=2323;               //local variable
		System.out.println(rollno);
	}
	public static void test3(int height) {//parameterized
		System.out.println(height);
	}
}