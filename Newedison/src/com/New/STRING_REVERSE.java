package com.New;

public class STRING_REVERSE {

	public static void main(String[] args) {
		
		/*String s="123456";
		int len = s.length();
		for (int i =len-1; i>=0; i--) {
			char c = s.charAt(i);
			System.out.print(c);
		}*/
		
		System.out.println();
    	String s1="A1B2C3D4E5";
    	int len2 = s1.length();
    	for (int j =len2-1; j>=0; j--) {
			char c2 = s1.charAt(j);
			System.out.print(c2);
		}
		System.out.println();
		
    	String s2="56789";
    	char[] ca = s2.toCharArray();
    	int len3 = ca.length;
    	String rev="";
    	for (int k =len3-1; k>=0; k--) {
			rev=rev+ca[k];
		}
    	System.out.print(rev);
    	} 	
}
