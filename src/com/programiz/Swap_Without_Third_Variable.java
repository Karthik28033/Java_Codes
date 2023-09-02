package com.programiz;
//Java Program to Swap Two Numbers without third variable
public class Swap_Without_Third_Variable {
	public static void main(String[] args) {
		 
		int a=10,b=20;
		System.out.printf("BEFORE SWAP a=%d and b=%d",a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" ");
		System.out.printf("AFTER SWAP a=%d and b=%d",a,b);
	}

}
