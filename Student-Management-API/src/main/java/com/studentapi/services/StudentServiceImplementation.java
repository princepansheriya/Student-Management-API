package com.studentapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapi.entities.Student;
import com.studentapi.repositories.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService{
	 @Autowired
	    private StudentRepository studentRepository;

	    @Override
	    public Student createStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    @Override
	    public Student getStudentById(Long id) {
	        Optional<Student> studentOptional = studentRepository.findById(id);
	        if (studentOptional.isPresent()) {
	            return studentOptional.get();
	        }
	        return null; 
	    }

	    @Override
	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    @Override
	    public Student updateStudent(Long id, Student student) {
	        Optional<Student> existingStudentOptional = studentRepository.findById(id);
	        if (existingStudentOptional.isPresent()) {
	            Student existingStudent = existingStudentOptional.get();
	            // Update the properties of the existing student with the new student's properties
	            existingStudent.setName(student.getName());
	            existingStudent.setBatch(student.getBatch());
	            existingStudent.setDateOfBirth(student.getDateOfBirth());
	            existingStudent.setEmail(student.getEmail());
	            existingStudent.setPhoneNumber(student.getPhoneNumber());
	            // Save the updated student
	            return studentRepository.save(existingStudent);
	        }
	        return null; 
	    }

	    @Override
	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }
	}

