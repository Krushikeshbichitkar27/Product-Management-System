package com.feesManagementSystem;

import java.util.HashMap;
/*
 * program FMS
 * code by:krushikesh
 * date:26-10-2022
 */
//importing packages
import java.util.Scanner;

//declaring class
public class StudentFeesData {

	// calling main method
	public static void main(String[] args) {
		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating Student fees data object
		Student sdata = new Student();
		// TODO Auto-generated method stub
		HashMap<String, Student> sfees = new HashMap<String, Student>();

		// adding students
		sfees.put("Krushikesh", new Student(21, "krushikesh", 16000));
		sfees.put("Pooja", new Student(41, "pooja", 18000));
		sfees.put("Raj", new Student(21, "Raj", 6000));
		sfees.put("Jay", new Student(21, "jay", 23000));
		sfees.put("Rashi", new Student(21, "rashi", 12000));

		System.out.println("Fees Portal :");
		System.out.println("=============================");
		System.out.println("Enter Student Name :");
		String student = sc.nextLine();

		// check :Student is present in the map
		boolean status = sfees.containsKey(student);

		// displaying the information
		int fees = 15000;
		if (status) {
			System.out.println("============Student Fees Information=================");
			sdata = sfees.get(student);
			System.out.println(sdata);
		} else if (fees < 15000) {
			System.out.println("============Student Fees not paid=================");
		} else if (fees > 15000) {
			System.out.println("============Student Fees paid=================");
		} else {
			System.out.println("=============Student Not Found================");
		}

		sc.close();

	}
}
