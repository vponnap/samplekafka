package com.demo.samplekafka;

public class basics002 {
	
	int num ;
	String s;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//For multi Dimensional Arrays length always bring only the base size.	
	//byte->short->integer->float->double
		
	
		basics002 b = new basics002();
		System.out.println(b.num);
		System.out.println(b.s);
		
		String [] s1 = new String[3];
		
		int i =0;
		
		int [][] j = new int[3][2];
		
		System.out.println(j.length);
		
		int k =3;
		byte b1 = (byte) k;
		
		char c = 'V';
	    int t = c;
		
	System.out.println(" the integer value is" + t);	
	System.out.println(" the values are " + b1);
		
		
//		for (String s : s1)
//			System.out.println("the array values are " + s1[i].concat("Element"+ ":"+i));
//				
	}


}
