package com.sid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

	
	
}
