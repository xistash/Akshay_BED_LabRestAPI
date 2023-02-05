package com.greatlearning.studentdebatemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentdebatemanagement.entity.Student;
import com.greatlearning.studentdebatemanagement.repository.StudentRepository;
import com.greatlearning.studentdebatemanagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepo;

	@Override
	public List<Student> findAll() {
		return studentrepo.findAll();
	}

	@Override
	public Student findById(int id) {
		return studentrepo.findById(id).get();
	}

	@Override
	public void save(Student student) {
		studentrepo.save(student);
	}

	@Override
	public void deleteById(int id) {
		studentrepo.deleteById(id);
	}

}
