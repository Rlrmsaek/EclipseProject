package com.SDET_java_prg;

public class SumOfArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7};
		int sum=0; 
		
		// METHOD 0NE
		/*
		 * for(int i=0;i<a.length;i++) { sum=sum+a[i]; } System.out.println(sum);
		 * 
		 */
		
		// METHOD TWO
		/*
		 * for (int value : a) { sum=sum+value; } System.out.println(sum);
		 */
		
		// method three
//		
//		for (int i = 0; i < a.length; i++) {
//		if (a[i]%2==0) {
//			System.out.print(a[i]);
//		}
//		else 
//			System.out.print(a[i]);
		
		
		// method four
		
		for (int value : a) {
			if(value%2==0) {
				System.out.println(value);
			}
			}
		}
}
