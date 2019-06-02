package com.demo.samplekafka;

public class basics006 {
// This is for local and instance variables.
	
	
	String s1 =  "Venkata";
	String s2 =  "venkata";

	public static void main(String[] args) {
	
	basics006 b = new basics006();
	basics006 b1 = new basics006();
	basics006 b2 = new basics006();
	
	basics006 b3=b2;
	
	System.out.println(b1==b2);
	System.out.println(b2==b3);
	
	boolean ref = (b.s1==b.s2);
	boolean cont = b.s1.equalsIgnoreCase(b.s2);
	
	
	System.out.println(" the boolean value is " + ref);
	System.out.println(" the boolean value is " + cont);	
	
	 int y =10;
     int x1= y++;
     int x = ++y;
     
     System.out.println(" the pre increment is " + x);
     System.out.println(" the post incremnent is " + x1);  
   
     int a = 10, n = 15;
     
     if(a >= 10 & n > 15) {
     ++a;
     
     System.out.println(a+"------"+n);
     }
     else {
     ++n;
     }
     System.out.println(a+"------"+n);
     
		
	}

}