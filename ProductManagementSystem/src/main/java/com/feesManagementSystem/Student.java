package com.feesManagementSystem;
/*
 * program: fees management system
 * code by: krushikesh
 * date: 26-10-2022
 */

//declaring class
public class Student {
	// instance variables
	private int sid;
	private String sName;
	private double fees;

	// constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor
	public Student(int sid, String sName, double fees) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.fees = fees;
	}

	// getter setter method
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	// toString method
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", fees=" + fees + "]";
	}

}
