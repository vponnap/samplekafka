package com.demo.samplekafka;

public class polyRunner {

	public int sum(int x, int y) {

		return x + y;
	}

	public int sum(int x, int y, int z) {

		return x + y + z;
	}

	public double sum(double x, double y) {

		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polyRunner pr = new polyRunner();

		System.out.println(pr.sum(1, 2));
		System.out.println(pr.sum(10, 20, 30));
		System.out.println(pr.sum(1.4, 2.4));

	}

}
