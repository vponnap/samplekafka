package com.demo.samplekafka;

public class basics003 {

	int num;
	String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//For multi Dimensional Arrays length always bring only the base size.	
// byte->short->integer->float->double

		basics003 b = new basics003();
		System.out.println(b.num);
		System.out.println(b.s);

		String[] s1 = new String[3];

		int i = 0;

		int[][] j = new int[3][2];

		System.out.println("Array of base length " + j.length);
		System.out.println("Array of child length " + j[0].length);

		int k = 3;
		byte b1 = (byte) k;

		char c = 'V';
		int t = c;

		int[] n1 = { 1, 2, 3 };
		int[] n2 = { 1, 2, 3, 4 };

		n1 = n2;

		for (int t1 : n1)
			System.out.println("the elements are" + t1);
		
		String s = Integer.toString(k);

		System.out.println(" string is " + s);
		System.out.println(" integer value is " + t);
		System.out.println(" The values are " + b1);

	
	}

}
