package com.New;

public class STRING2 {

	public static void main(String[] args) {
		String a="account balance";
		String b="325864321";
		String c="what is mean by string";
		String d="account balance";
		String f="   ";
		String h="123 number";
		String st=new String("2180");
		String sr=new String("akjs");
		StringBuffer e=new StringBuffer("account balance");
		
		System.out.println(a.charAt(1));
		System.out.println(a.codePointBefore(1));
		//System.out.println(a.codePointCount(0, 15));
		System.out.println(a.concat(" low"));
		System.out.println(a.contains(c)); 
		System.out.println(a.contentEquals(d));
		System.out.println(a.contentEquals(e)); /// string buffer
		System.out.println(a.endsWith(d)); /// end value
		System.out.println("index of "+b.indexOf("2"));  // must in ""
		System.out.println("index of "+a.indexOf("b"));
		System.out.println(b.indexOf("3", 3));
		System.out.println(a.indexOf("a", 1));
		System.out.println(f.isBlank());//include space
		System.out.println(f.isEmpty());// not include space
		System.out.println("last index"+d.lastIndexOf("o"));
		System.out.println("last index"+b.lastIndexOf("5",6));
		System.out.println("intern "+b.intern());
		System.out.println(f.length());
		System.out.println("matches "+d.matches(a));
		System.out.println(d.replace("a", "A"));
		System.out.println(c.replace("string","java")); 
		System.out.println(h.substring(4));
		System.out.println(h.substring(4, 7));
		System.out.println(h.subSequence(4, 9));
		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println(a.concat(st));
		System.out.println(sr);
		
	}
}

