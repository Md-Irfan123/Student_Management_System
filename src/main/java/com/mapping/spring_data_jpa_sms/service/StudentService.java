package com.mapping.spring_data_jpa_sms.service;

import java.util.List;

import com.mapping.spring_data_jpa_sms.dto.Student;

public interface StudentService {
	
	
	   Student addStudent(Student student);
	    List<Student> getStudents();
	    Student updateStudent(Student student, Long id);
	    Student getStudentById(Long id);
	    void deleteStudent(Long id);

}
