package com.greatlearning.studentdebatemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.studentdebatemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u   FROM User u WHERE   u.username like ?1")
	User getUserByUsername(String username);

}
