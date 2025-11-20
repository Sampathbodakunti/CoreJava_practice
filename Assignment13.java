package com.corejava.practice;
public class Assignment13 {

	public static void main(String[] args) {
		int[] i= {2,5,1,6,9};
		int max=i[0];
	    int index=0;
	    for(int a=1;a<i.length;a++) {
	    	if(i[0]<i[a]) {
	    		max=i[a];
	    		index=a;
	    	}
	    }System.out.println(max);
	    System.out.println(index);
	    }
}
 