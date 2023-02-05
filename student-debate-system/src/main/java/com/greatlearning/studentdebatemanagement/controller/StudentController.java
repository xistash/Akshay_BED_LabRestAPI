package com.greatlearning.studentdebatemanagement.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.studentdebatemanagement.entity.Student;
import com.greatlearning.studentdebatemanagement.service.impl.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	StudentServiceImpl studentserv;

	@RequestMapping("/students")
	public String listStudents(Model model) {
		List<Student> students = studentserv.findAll();
		model.addAttribute("studentsjsp", students);
		return "list-Students";
	}

	@RequestMapping("/updatestudent")
	public String updateStudent(@RequestParam("studentId") int id, Model model) {
		Student existingstudent = studentserv.findById(id);
		model.addAttribute("StudentUI", existingstudent);
		return "Student-form";
	}

	@PostMapping("/savestudent")
	public String saveStudent(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course,
			@RequestParam("country") String country) {
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setCourse(course);
		student.setCountry(country);
		studentserv.save(student);
		return "redirect:/students";

	}

	@RequestMapping("/addstudent")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("StudentUI", student);
		return "Student-form";
	}

	@RequestMapping("/deletestudent")
	public String deleteById(@RequestParam("studentId") int id) {
		studentserv.deleteById(id);
		return "redirect:/students";
	}

	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;
	}
}
