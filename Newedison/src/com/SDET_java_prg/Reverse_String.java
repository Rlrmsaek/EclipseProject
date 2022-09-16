package com.SDET_java_prg;

public class Reverse_String {

	public static void main(String[] args) {

		String a="noside";
		String b="";
		// METHOD 0NE
		/*
		 * int length = a.length(); for (int i = length-1; i>=0; i--) {
		 * 
		 * char c = a.charAt(i); System.out.print(c); }
		 */
		
		
		// METHOD TWO
		
		char[] ar = a.toCharArray();
		int length = ar.length;
		
		for (int i =length-1; i>=0; i--) {
		      b = b+ar[i];
		     //System.out.print(b);
		}
		System.out.println(b);
	}

}
