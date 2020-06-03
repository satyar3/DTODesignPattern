package BO;

import java.util.ArrayList;
import java.util.List;

import VOorTO.StudentTOorVOClass;

public class StudentBOClass
{
	private List<StudentTOorVOClass> students;
	
	public StudentBOClass()
	{
		students = new ArrayList<StudentTOorVOClass>();
		StudentTOorVOClass student1 = new StudentTOorVOClass(1, "Ram");
		StudentTOorVOClass student2 = new StudentTOorVOClass(2, "Sam");
		StudentTOorVOClass student3 = new StudentTOorVOClass(3, "Dam");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);		
	}
	
	public List<StudentTOorVOClass> getAllStudentDetails()
	{
		return students;
	}
	
	public void getSignleStudentDetails(StudentTOorVOClass student)
	{
		System.out.println("Student Name : "+ student.getName());
		System.out.println("Student Roll Number : "+ student.getRollNo());
	}
	
	public void updateStudentName(StudentTOorVOClass student, String name)
	{		
		student.setName(name);
	}
	
	public void deleteStudent(StudentTOorVOClass student)
	{
		students.remove(student);
	}
}
