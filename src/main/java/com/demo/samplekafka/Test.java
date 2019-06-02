package com.demo.samplekafka;

class Test {

	public static void main(String[] args) {

		int res = (10 > 20) ? 20 : (10 > 9) ? 1 : 2;
		System.out.println("the value is " + res);
		String name = null;

		if (name == null)
			System.out.println("the name is null  " + name);
		else
			System.out.println(" the name is not null " + name);

		int x = 0;
		
		switch (x+1) {

		default:
			System.out.println("this is default");

		case 1:
			System.out.println("the number is " + x);
      
		case 11:
			System.out.println("the number is 11");
	
		
			
		}

	}
}