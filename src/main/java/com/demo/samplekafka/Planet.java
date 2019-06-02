package com.demo.samplekafka;

public class Planet {

	String name;
	String location;
	Double DistancefrmSun;

	public void revolve() {
		System.out.println(" Earth revolves");
	}

	public void rotate() {
		System.out.println(" Earth rotates");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planet earth = new Planet();
		earth.revolve();
		earth.rotate();
	}

}
