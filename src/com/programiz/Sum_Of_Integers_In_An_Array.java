package com.programiz;

public class Sum_Of_Integers_In_An_Array {
	public static void main(String[] args) {
		int []arr= {1,2,3,5,8,9};
		int b=0;
		for(int a:arr) {
			b+=a;
		}System.out.println("SUM OF INTEGERS IN AN ARRAY IS: "+b);
	}

}
