package com.demo.samplekafka;

import java.util.StringTokenizer;

public class basics009 {

// This is for local and instance variables.

	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i)
			System.out.println("hello" + " " + i);

		int[][] x = { { 2, 4, 6, 8 }, { 2, 4 } };

		for (int[] x1 : x) {
			for (int x2 : x1) {
				System.out.print(x2 + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; ++i) {
			if (i % 2 == 0)
				continue;
			System.out.println(" i am out of blue moon " + i);
		}
		
		StringTokenizer st = new StringTokenizer("this is a test");
		while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
		
	}

}