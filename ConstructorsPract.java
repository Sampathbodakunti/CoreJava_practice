//Demonstration for constructors in java
package com.corejava.practice;

public class ConstructorsPract {
	String name;
	int age;
	//	 types of Constructors 
	//	1.default constructor-java it self creates a constructor implicitly
	//  2.No parameters constructor
	public ConstructorsPract() {
		name = "John";
		age = 18;
		System.out.println("Constructor called!");
	}


	//	3.Parameterized constructors
	public ConstructorsPract(String n,int a) {
		name=n;
		age=a;
		System.out.println();
	}

	public static void main(String[] args) {
		ConstructorsPract s1=new ConstructorsPract();//no parameters constructor called
		System.out.println(s1.name + " " + s1.age);

		ConstructorsPract s2=new ConstructorsPract("sam",18);// Parameterized constructor called
		System.out.println(s2.name+"  "+s2.age);
		

	}




}
