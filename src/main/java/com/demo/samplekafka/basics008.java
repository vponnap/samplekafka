package com.demo.samplekafka;

public class basics008 {

	basics008(double d) {
		System.out.println("int-double");

	}

	basics008(int i) {
		System.out.println("int-arg");

	}

	basics008() {
		System.out.println("no-arg");

	}

// This is for local and instance variables.

	public static void main(String[] args) {

		basics008 bi = new basics008(10);
		basics008 bd = new basics008(10.5);
		basics008 na = new basics008();

		String st = "Venkata";

		System.out.println("The length of string is " + st.length());

		for (int i = 0; i < st.length(); ++i) {

			if (st.charAt(i) == 'k' || st.charAt(i) == 'a')
				continue;
			System.out.println("the name is " + st.charAt(i));
		}

		int x = 130;
		byte b1 = (byte) x;
		System.out.println(" the byte is" + b1);

	}

}
