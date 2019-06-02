package com.demo.samplekafka;

public class basics0010 {

	public basics0010() {

		System.out.println("A");

	}

	class B extends basics0010 {

		public B() {
			System.out.println("B");
		}
	}

	class C extends B {
		
		public C() {
			System.out.println("C");
			
		}
	}
// This is for local and instance variables.

	public static void main(String[] args) {

			
	}
}