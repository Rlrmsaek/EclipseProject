package com.New;

public class STRING_BUFFER {

	public static void main(String[] args) {
		
		StringBuffer  a= new StringBuffer("STRING");
    	StringBuffer  a1=new StringBuffer("GREEN TECHNOLOGIES");
		StringBuffer a3=new StringBuffer("12345");
		System.out.println(a.append("BUFFER"));
		System.out.println(a.charAt(0));
		System.out.println(a.equals(a1));
		System.out.println(a1.indexOf("G"));
		System.out.println(a1.lastIndexOf("O"));
		System.out.println(a1.indexOf("G", 1));
		System.out.println(a1.lastIndexOf("R",1));
		System.out.println(a1.toString());
		System.out.println(a3.capacity());
		System.out.println(a3.hashCode());
		System.out.println(a3.reverse());
		System.out.println(a.deleteCharAt(1));
	    System.out.println(a.delete(0, 9));
		System.out.println(a3.insert(0, "6"));
		System.out.println(a3.insert(0, a1));
		
	}

}
