package com.Encaptulation;

public class Student {
	
	private int rollNo;
	private String name;
	private boolean isAttended;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setStudentAttendence(boolean flag) {
		isAttended = flag;
		System.out.println("teacher assighned attendence to student");
	}  
	
	public boolean getStudentAttendence() {
		System.out.println("Teacher access to student attendence");
		return isAttended;
		
	}

}
