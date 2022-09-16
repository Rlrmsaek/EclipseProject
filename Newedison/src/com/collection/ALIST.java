package com.collection;

import java.util.ArrayList;
import java.util.List;
public class ALIST {

	
public static void main(String[] args) {
	 List o=new ArrayList();
	 
      o.add(1);
      o.add(2);
      o.add(3);
      o.add("five");
      o.add("six");
      o.add(3, "four");
     //System.out.println(o); 
 	 ArrayList u=new ArrayList <> ();
 	 //u.addAll(o);
     u.add(10);
     u.add(20);
     u.add("thirty");
 	 ArrayList t=new ArrayList <> ();
     t.addAll(o);
     t.add("eight");
     t.add(6, "seven");
     System.out.println(t);
     System.out.println(o.get(3));
     System.out.println(t.indexOf(3));
     System.out.println(t.lastIndexOf("eight"));
     System.out.println(t.contains("five"));
     System.out.println(t.containsAll(u));
     System.out.println(t.remove(0));
     System.out.println(t);
     t.remove("four");
     System.out.println(t);
     t.set(0, "two");
     System.out.println(t);
     t.add(9);
     t.add(10);

     System.out.println(t);
     System.out.println(t.subList(6, 8));     
    
      
     
}
}
