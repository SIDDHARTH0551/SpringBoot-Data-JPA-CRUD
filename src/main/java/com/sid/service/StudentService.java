package com.sid.service;

import java.util.List;

import com.sid.entities.Student;

public interface StudentService 
{
	//Insert student details method.
	public boolean addStudentDetails(Student std);
	
	//Retrieve All student details.
	public List<Student> getAllStdDetails();
	
	//Retrieve single student details.
	public Student getStdDetails(long id);
	
	//Update student details
	public boolean updateStdDetails(long id, float marks);
	
	//Delete student details
	public boolean deleteStdDetails(long id);
	

}
