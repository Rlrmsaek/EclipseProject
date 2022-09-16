package com.SDET_java_prg;

import java.util.Scanner;

public class Plindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		String nln = sc.nextLine();
		String   c="";
		int length = nln.length();
		for (int i = length-1; i>=0; i--) {
			 c=c+nln.charAt(i);
		}
	     {
		//System.out.print(c);	
		}
		String d=c;
		if (d==c) {
			System.out.println(c+"palindrome");
		}
	else {
		System.out.println(c+"not palindrome");
	}
	}}



