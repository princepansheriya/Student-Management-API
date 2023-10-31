package com.studentapi.services;

import java.util.List;

import com.studentapi.entities.Student;

public interface StudentService {
	// Create a new student
    Student createStudent(Student student);

    // Retrieve a student by ID
    Student getStudentById(Long id);

    // Retrieve a list of all students
    List<Student> getAllStudents();

    // Update a student's information
    Student updateStudent(Long id, Student student);

    // Delete a student by ID
    void deleteStudent(Long id);

}
