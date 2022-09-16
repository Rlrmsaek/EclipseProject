package com.SDET_java_prg;

import java.util.HashSet;

public class Duplicate_Value {

public static void main(String[] args) {

	// Method one
	
	/*int a[]= {2,3,4,5,6};
	boolean b=false;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				System.out.println("DUPLICATE VALUE IS "+a[i]);
				b=true;
}}}
		
			if (b==false) {
				System.out.println("DUPLICATE VALUE IS NOT PRESENT");
*/

	//String  a="3,4,5,6,4";
	
	// Method two
	
	HashSet<String>  hs=new HashSet<>();
	
    System.out.println("duplicate value is present"+hs.add("1"));
    System.out.println("duplicate value is present"+hs.add("2"));
    System.out.println("duplicate value is present"+hs.add("3"));
    System.out.println("duplicate value is present"+hs.add("1"));
}}