package com.demo.samplekafka;

public class basics005 {
// This is for local and instance variables.
	
	String myStr = "7777";

	public void doStuff(String s) {
		int myNum=0;
		
		try {
			String myStr = s;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException e) {
			System.err.println("Error");
		}
		System.out.println("myStr: " + myStr + " ,myNum: " + myNum);
	}

	public static void main(String[] args) {
		basics005 t = new basics005();
		t.doStuff("9999");
		
	}

}