package level;

import java.util.Scanner;

public class REVERSE {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER A NUMBER "+s);
	
	String nl = s.nextLine();
	
	// METHOD ONE ---->
	/*int rev=0;
	while (nt!=0) {
		  rev=rev*10+(nt%10);
		  nt=nt/10;
		  System.out.println(rev);*/

	//System.out.println(rev);
	
	// METH0D TWO ---->
	/*
	 * StringBuffer str=new StringBuffer(String.valueOf(nt)); StringBuffer reverse =
	 * str.reverse(); System.out.println(reverse);
	 */
	
	// METHOD THREE ------>
      StringBuilder sb=new StringBuilder(); 
	  StringBuilder append = sb.append(nl);
	  StringBuilder reverse = append.reverse();
	  System.out.println(reverse);
}
}

