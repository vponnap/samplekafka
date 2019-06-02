package com.demo.samplekafka;

public class MotorBike {

	private int speed = 10;

	public void setSpeed(int speed) {
		this.speed = speed;

		System.out.println(speed);

	}

	public int getSpeed() {
		return this.speed;
	}

	public void gears() {
		System.out.println(" This has two gears");

	}

	public void brakes() {
		System.out.println(" This has two brakes");

	}

}
