package org.student;

import org.department.Department;

public class Student extends Department{

	
	public void studentName()
	{
		System.out.println("Student Name: Ram");

	}
	public void studentDept()
	{
		System.out.println("Student Dept: EIE");

	}

	public void studentId()
	{
		System.out.println("Student ID: 16789");

	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();

	}

}
