package com.demo.samplekafka;

public class MyBike {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike();
		MotorBike toyota = new MotorBike();

		honda.brakes();
		honda.gears();

		toyota.brakes();
		toyota.gears();
		
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
		
		

	}

}
