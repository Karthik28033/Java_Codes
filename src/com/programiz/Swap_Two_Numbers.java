package com.programiz;
//Java Program to Swap Two Numbers
public class Swap_Two_Numbers {
	public static void main(String[]args) {
		int a=10,b=20;
		System.out.println("BEFORE SWAP TWO NUMBERS: "+ "a="+ a+ " "+ "b="+ b);
		int c=a;
		a=b;
		b=c;

		System.out.println("AFTER SWAP TWO NUMBERS: " + "a="+ a+ " "+ "b="+ b);

}
}