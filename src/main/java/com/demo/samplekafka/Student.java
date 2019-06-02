package com.demo.samplekafka;

public class Student {

	int rollno;
	String name;
	
   Student(int rollno, String name) {
	
	   this.rollno=rollno;
	   this.name=name;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//Arrays assignment happens only reference changes but no copy of internal elements
// even with different values		
		
		int[] n1 = new int[2];

		n1[0] = 10;
		n1[1] = 20;

		for (int n : n1)
			System.out.println("the array values are " + n + ":");

		System.out.println(n1);

		Student[] students = { new Student(101, "venkata"), new Student(102, "kalyani"), new Student(103, "vallabh"),
				new Student(104, "supraja") };

		System.out.println(students);
		System.out.println(students[2]);
		System.out.println(students[2].rollno);
	}

}
