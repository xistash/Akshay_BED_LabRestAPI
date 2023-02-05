package com.greatlearning.studentdebatemanagement.service;

import java.util.List;

import com.greatlearning.studentdebatemanagement.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);

}
