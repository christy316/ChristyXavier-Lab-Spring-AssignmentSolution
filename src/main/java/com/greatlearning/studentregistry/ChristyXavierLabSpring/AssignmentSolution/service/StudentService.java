package com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.service;

import java.util.List;

import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int studentId);

	void save(int studentId, String firstName, String lastName, String course, String country);

	void deleteById(int studentId);

}
