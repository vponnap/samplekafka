package com.demo.samplekafka;

public class basics001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Always no CE when there is data assignment 
//  happens from lower value to higher value . This is called implicit type casting	
// Assignment happens on higher value to lower value type casting is required.
//byte->short->int->long->float->double
		
		char c = 'v';
		int i = c;
		
		byte b =10;
		float f = b;
		
		
		int x= 10;
		byte b1 = (byte)(x); 
		
		int y =10;
		float f1 = 100f;
		
		y =(int)f1;
				
		System.out.println(" The number is " + i);
		System.out.println(" The float  is " + f);
		System.out.println(" The byte  is " + b1);
		System.out.println(" The integer  is " + y);
		
		String[] s1 = {"Mayuri", "Vallabh", "Supraja"};
		System.out.println(s1.length);
		System.out.println(s1[2].length());
		
		int [] nums = {10,20,30,40,50};
		
		nums[2] = nums[4];
		nums[4] = 60;
		
		for(int x1 : nums)
		System.out.println("the array is " + x1);
		
//Arrays assignment happens only reference changes but no copy of internal elements
// even with different values		
		
		int [] n1 = new int[3];
		
		int [] n2 = {10,20,40,40,50};
		n1 =n2;
		for (int n : n1)
			System.out.println("the array values are " + n + ":");
				
	}

}
