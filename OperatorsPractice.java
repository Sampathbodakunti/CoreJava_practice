package com.corejava.practice;
public class OperatorsPractice {
	public static void main(String[] args) {
		int i=40;
		int j=30;
		System.out.println(i+j);
		System.out.println(i-j);          
		System.out.println(i*j);         //arithmetic operators
		System.out.println(i/j);
		System.out.println(i%j);
		System.out.println("________________________________");

		int a=10;
		int b=15;
		System.out.println(++a);      
		System.out.println(a++);      //Unary operators
		System.out.println(--b);
		System.out.println(b--);
		System.out.println(a&b);
		System.out.println("________________________________");
		int s=10;
		int t=20;
		System.out.println(s+=t);// s=s+t; can be written as s+=t
		System.out.println(s-=t);
		System.out.println(s*=t);   //assignment operators
		System.out.println(s/=t);
		System.out.println(s%=t);
		System.out.println("________________________________");
		int r=2;
		int p=5;
		System.out.println(r>p);
		System.out.println(r<p);
		System.out.println(r>=p);    //relational operators
		System.out.println(r<=p);
		System.out.println(r!=p);
		System.out.println(r==p);
		System.out.println("_________________________________");
		
		int h=20;
		int g=30;
		System.out.println(g<h&& g<40);
		System.out.println(h<g || g<40);
	}

}
