package com.greatlearning.studentdebatemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentdebatemanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
