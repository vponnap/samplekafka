package com.demo.samplekafka;

public class MyTest001 {

	public static void main(String[] args) {

		boolean isForKafka = true;
		boolean isForDsCache = true;

		int[] nums = { 1, 2, 3, 4, 5 };

		int[][] arrys = { { 1, 2, 3 }, { 3, 4, 5 } };

		int[] keys = new int[3];

		for (int j : keys)
			System.out.println(" the values are " + j);

		for (int i : nums)
			System.out.println("the numbs are " + i);

		if (isForDsCache) {
			System.out.println("I am in DS Cache");
		}

		if (isForKafka) {
			System.out.println("I am in Kafka Cache");
		}

		if (!(isForKafka || isForDsCache))
			System.out.println(" I am neither");

	}
}
