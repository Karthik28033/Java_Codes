package com.programiz;
//Java Program to Find all Roots of a Quadratic Equation
public class Find_All_Roots_Of_A_Quadratic_Equation {
	public static void main(String[] args) {
	double a=2,b=8,c=7;
	double num1=((-b)+((Math.sqrt((b*b)-(4*a*c)))));
	double num2=2*a;
	double x1=num1/num2;
	System.out.println("value of x1 ="+x1);
	double num3=((-b)-((Math.sqrt((b*b)-(4*a*c)))));
	double x2=num3/num2;
	System.out.println("value of x2 ="+x2);
	}

}
