package com.programiz;
//Java Program to Find the Largest Among Three Numbers
public class Largest_Among_Three_Numbers {
	public static void main(String[] args) {
	
		int num1=45,num2=88,num3=65;
		if(num1>=num2 && num1>=num3) {
			System.out.println("num1 is the largest among three numbers: "+num1);
		} else if(num2>=num1 && num2>=num3 ){
		System.out.println("num2 is the largest among three numbers: "+num2);	
		} else {
			System.out.println("num3 is the largest among three numbers: "+num3);	
		}
	}

}
