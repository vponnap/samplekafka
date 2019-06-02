package com.demo.samplekafka;

public class basics007 {
// This is for local and instance variables.

	public static void main(String[] args) {

		int i = 5;

		while (isAvaialble(i)) {

			System.out.print(i);
			i--;
		}
		
		int [] x = {1,2,3,4};
		int j=0;
		
		do {
			
		  System.out.println(x[j]);
		  j++;
		} while(j < x.length);
		
		int m=5;
		
		do {
			
			  System.out.println(++m + " ");
			  
			} while(m==0);
				
		
		
	}

	public static boolean isAvaialble(int i) {
		return i-- > 0 ? true : false;
	}

}