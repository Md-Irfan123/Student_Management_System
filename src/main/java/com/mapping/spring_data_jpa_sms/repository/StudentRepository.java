package com.mapping.spring_data_jpa_sms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.spring_data_jpa_sms.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	 Optional<Student> findByEmail(String email);

}
