package com.New;

public class STRING_BUFFER_2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(" string buffer");
		StringBuilder sb2=new StringBuilder(" string builder");	
		System.out.println("before sb length"+sb.length());
		System.out.println("before sb capacity"+sb.capacity());
		System.out.println(sb.append( sb2));
		System.out.println("after sb capacity"+sb.capacity());
		System.out.println("after sb length"+sb.length());
		System.out.println(sb2.append(sb));
		System.out.println(sb.charAt(2));
		System.out.println(sb.compareTo(sb));
		System.out.println(sb.delete(0, 7));
		System.out.println(sb2.substring(7, 20));
		System.out.println();
		
	}

}