package com.New;
public class STRING {
  public static void main(String[] args) {
		String  x ="STRING PROJECT";
		String  y ="123401234";
		String  z ="Welcome to String class";
		char a = x.charAt(7);
		System.out.println(a);
	    int a1 = y.length();
	    System.out.println(a1);
	    boolean a3 =x.equals(y);
	    System.out.println(a3);
	    
	    String a4 = y.replace("0", "5");
	    System.out.println(a4);
	    
	    String a5 = x.replace("STRING","JAVA");
	    System.out.println(a5);
	    
	    String a6 = y.substring(5);
	    System.out.println(a6);
	    
	    String a7 = x.substring(0,6);
	    System.out.println(a7);
	    
	    boolean a8 = z.contains(x);
	    System.out.println(a8);
	    
	    boolean a9=z.contains("class");
	    System.out.println(a9);
	    
	    String a10 = z.concat("  and "+x);
	    System.out.println(a10);
	    
	    String a11 = z.concat("  Students");
	    System.out.println(a11);
	     
		String  w="J,A,V,A";
		String[]  b=w.split(",");
		for (String c:b)
        System.out.print(c);
	}
}