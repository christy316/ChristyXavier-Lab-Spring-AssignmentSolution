package com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.model.Student;
import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void save(int studentId, String firstName, String lastName, String course, String country) {

		Student student;
		if (studentId != 0) {
			student = studentRepository.findById(studentId).get();
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setCourse(course);
			student.setCountry(country);
		} else {
			student = new Student(firstName, lastName, course, country);
		}

		studentRepository.save(student);

	}

	@Override
	public void deleteById(int studentId) {

		studentRepository.deleteById(studentId);
	}

}
