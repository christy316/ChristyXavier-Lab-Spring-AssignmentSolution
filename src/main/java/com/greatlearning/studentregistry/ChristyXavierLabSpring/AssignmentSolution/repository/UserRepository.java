package com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUserName(String name);
}
