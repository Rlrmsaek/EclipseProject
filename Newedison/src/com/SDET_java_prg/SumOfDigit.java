package com.SDET_java_prg;

import java.util.Scanner;

public class SumOfDigit {

public static void main(String[] args) {
	
	//  TO FIND THE SUM OF VALUE
	
		int a=5678;
		int sum=0;
		
		while (a>0) {
			int b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
		}
		
		/*
		///  TO FIND A LARGEST NUMBER
		Scanner sc=new Scanner(System.in);
		
		System.out.println("first value");
		 int a=sc.nextInt();
	    System.out.println("second value");
	     int b=sc.nextInt();
	    System.out.println("third value");
	     int c=sc.nextInt();
	     
	     if( a>b  &&  a>c ) {
	    	 System.out.println("a is large");
	     }
	     else if( b>a   &&   b>c ){
	    	 System.out.println("b is large");
	     }
	     else {
	    	 System.out.println("c is large");*/
	     }


