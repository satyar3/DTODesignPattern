package Runner;

import java.util.List;

import BO.StudentBOClass;
import VOorTO.StudentTOorVOClass;

public class Runner
{

	public static void main(String[] args)
	{
		StudentBOClass students = new StudentBOClass();
		List<StudentTOorVOClass> studentList = students.getAllStudentDetails();
		
		for(StudentTOorVOClass student : studentList)
		{
			System.out.println("Name : "+student.getName());
			System.out.println("Roll : "+student.getRollNo());
			System.out.println("*****************************");
		}
		
		students.deleteStudent(studentList.get(2));
		
		for(StudentTOorVOClass student : studentList)
		{
			System.out.println("Name : "+student.getName());
			System.out.println("Roll : "+student.getRollNo());
			System.out.println("*****************************");
		}
		
		students.getSignleStudentDetails(studentList.get(1));
		
		students.updateStudentName(studentList.get(1), "New Sam");
		
		students.getSignleStudentDetails(studentList.get(1));
	}

}
