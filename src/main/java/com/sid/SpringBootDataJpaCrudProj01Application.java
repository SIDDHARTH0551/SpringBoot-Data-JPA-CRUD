package com.sid;

import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sid.entities.Student;
import com.sid.service.StudentService;
import com.sid.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootDataJpaCrudProj01Application {

	public static void main(String[] args)
	{
	  ApplicationContext context = SpringApplication.run(SpringBootDataJpaCrudProj01Application.class, args);
	
	  StudentService stdService = context.getBean(StudentServiceImpl.class);
	
	  //------------insert operation-------------------
 
	  Student std = new Student();
	  std.setName("Ritesh  Singh");
	  std.setRollno(195118);
	  std.setMarks(79.8f);
	  
	  boolean status = stdService.addStudentDetails(std);
	  
	  if(status)
	  {
		  System.out.println("Student inserted successfully.");
	  }
	  else
	  {
		  System.out.println("Student data not Inserted dueto some issue.");
	  }

	  
//	  -------------select/Retrieve  operation 1------------------------

/*	  
	  //Retrieve all data from the database
	  List<Student> stdList = stdService.getAllStdDetails();	  
	  for(Student std : stdList)
	  {
		  System.out.println("Id : "+std.getId());
		  System.out.println("Name : "+std.getName());
		  System.out.println("Rollno : "+std.getRollno());
		  System.out.println("Marks : "+std.getMarks());
		  System.out.println("=============================");  
	  }
	  

//	  --------------Select  operation 2 ------------------------
	 
	  //Retrieve only single data from the database
	  
/*	  Student std = stdService.getStdDetails(4L);
	  
	  if(std !=null) {
	  System.out.println("Id : "+std.getId());
	  System.out.println("Name : "+std.getName());
	  System.out.println("Rollno : "+std.getRollno());
	  System.out.println("Marks : "+std.getMarks());
	  }
	  else
	  {
		  System.out.println("This Student ID is not Present in database");
	  }
*/
	
//	  --------------Update operation---------------------
	 
/*	  boolean status = stdService.updateStdDetails(2L, 74.4f);
	  
	  if(status)
	  {
		System.out.println("Student details updated Successfully.");  
	  }
	  else
	  {
			System.out.println("Student details not updated Successfully.");  
	  }
*/
	  
//	  -----------delete operation--------------------
/*	  boolean status = stdService.deleteStdDetails(3L);
	  
	  if(status)
	  {
		System.out.println("Student details deleted Successfully.");  
	  }
	  
	  else
	  {
			System.out.println("Student details not deleted Successfully.");  
	  }
	 
*/	 
	}

}
