package com.Encaptulation;

public class Teacher {
	
	public static void main(String[] args) {
		Student st = new Student(101);
		//st.isAttended = true;
		st.setStudentAttendence(true);
		st.getStudentAttendence();
	}

}
