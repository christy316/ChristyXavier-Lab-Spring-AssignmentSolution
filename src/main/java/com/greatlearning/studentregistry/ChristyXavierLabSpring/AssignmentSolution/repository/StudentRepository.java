package com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
