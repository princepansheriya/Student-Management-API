package com.studentapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapi.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
