package com.SDET_java_prg;

public class ArrayValue_Max_Min {

	public static void main(String[] args) {
		
		  int a[]= {1,2,3,5,6}; 
		  int sum1=0;
		  
		  for (int i = 0; i < a.length; i++) {
			  sum1=sum1+a[i];
			  }
		  System.out.println(sum1);
		  int sum2=0;
		  for (int i = 1; i <=6; i++) { 
			  sum2=sum2+i; 
			  }
		  System.out.println(sum2);
		  System.out.println("MISSING VALUE IS = "+(sum2-sum1));
		 
	
	//	2.  MAXIMUM NUMBER
		/*int a[]= {10,20,30,60,70};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max) {
				max=a[i];
	
			}
			if (a[i]<min) {
				min=a[i];
				System.out.println(min);
			}
		}
		System.out.println(max);
		System.out.println(min);*/
	}
	

}
