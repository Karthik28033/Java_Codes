package com.programiz;
//Java Program to Compute Quotient and Remainder
import java.util.Scanner;
public class Quotient_And_Remainder {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER DIVIDEND VALUE: ");
		double dividend =sc.nextDouble();
		System.out.print("ENTER DIVISOR VALUE: ");
		double divisor =sc.nextDouble();
		
		double quotient = dividend/divisor;
		System.out.println("QUOTIENT IS:"+quotient);
		
		double remainder = dividend%divisor;
		System.out.println("REMAINDER IS:"+ remainder);
		
	
		
	}
}
