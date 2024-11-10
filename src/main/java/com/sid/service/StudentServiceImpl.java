package com.sid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.entities.Student;
import com.sid.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public boolean addStudentDetails(Student std) 
	{
		
		boolean status = false;
		try {
			//save method is used to store the data in the database
			studentRepository.save(std);
			status = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}

	@Override
	public List<Student> getAllStdDetails() 
	{
		//findAll is used to retrieve all data from the database.
		return studentRepository.findAll();
	}

	//
	@Override
	public Student getStdDetails(long id) 
	{
		//findById is used to retrieve single data from the database
		Optional<Student >optional=studentRepository.findById(id);
		if(optional.isPresent())
		{
		 return optional.get();	
		}
		else
		{
			return null;	
		}
	
	}

	@Override
	public boolean updateStdDetails(long id, float marks) {
		
		Student std = getStdDetails(id);
		if(std != null)
		{
			std.setMarks(marks);
			studentRepository.save(std);
			
			return true;
		}
		
		return false;
		
		
	}

	@Override
	public boolean deleteStdDetails(long id) {
		boolean status = false;
		try {
			studentRepository.deleteById(id);
			status = true;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		status = false;
		}
		
		return status;
	}

}
