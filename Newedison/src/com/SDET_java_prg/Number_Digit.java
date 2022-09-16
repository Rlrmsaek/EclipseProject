package com.SDET_java_prg;

public class Number_Digit {

	public static void main(String[] args) {
//
//		int a=456789;
//		int count=0;
//		
//		while (a>0) {
//			a=a/10;
//			count++;
//		}
//		System.out.println(count);
//		
	
	
	int b=234567;
	int even_count=0;
	int odd_count=0;
	
	
	while (b>0) {
		int c=b%10;
		if (c%2==0) {
			even_count++;
		}
		else {
			odd_count++;
		}
		b=b/10;
	}
	System.out.println("Even count = "+ even_count);
	System.out.println("Odd count = "+ odd_count);
	
	}

}
