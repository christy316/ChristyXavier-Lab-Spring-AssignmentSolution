package com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.model.Student;
import com.greatlearning.studentregistry.ChristyXavierLabSpring.AssignmentSolution.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student-list")
	public String customerList(Model model) {

		List<Student> studentList = studentService.findAll();

		model.addAttribute("Students", studentList);

		return "list-students";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {

		Student student = new Student();
		model.addAttribute("Student", student);

		return "student-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int studentId, Model modell) {

		Student student = studentService.findById(studentId);

		modell.addAttribute("Student", student);

		return "student-form";
	}

	@PostMapping("/save")
	public String saveCustomer(@RequestParam("studentId") int studentId, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course,
			@RequestParam("country") String country) {

		studentService.save(studentId, firstName, lastName, course, country);

		return "redirect:/student/student-list";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("studentId") int studentId) {

		studentService.deleteById(studentId);

		return "redirect:/student/student-list";
	}

}
