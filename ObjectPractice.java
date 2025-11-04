// Demonstration for Object in java
package com.corejava.practice;
public  class ObjectPractice {
	int i;
	int j;
	
	public ObjectPractice() {
		i=10;
		j=20;
	}

	public static void main(String[] args) {
		ObjectPractice ob= new ObjectPractice();
		System.out.println(ob.i+ob.j);
	}

}
