package com.boa.crs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.crs.controller.AdminController;
import com.boa.crs.entity.Course;
import com.boa.crs.entity.Professor;
import com.boa.crs.entity.Student;
import com.boa.crs.repo.CourseRepository;
import com.boa.crs.repo.ProfessorRepository;
import com.boa.crs.repo.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class AdminService {

	private static final Logger logger = LoggerFactory.getLogger(AdminService.class);
	@Autowired
	ProfessorRepository professorRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired 
	StudentRepository studentRepository;
	
	@Transactional
	public boolean addProfessor(Professor professor) {
		logger.info("Servce Adding Professor");
		return professorRepository.save(professor) != null;
	}

	@Transactional
	public boolean addCourse(Course course) {
		logger.info("Servce Adding Course");
		return courseRepository.save(course) != null;
	}
	
	@Transactional
	public boolean addStudent(Student student) {
		logger.info("Servce Adding student");
		return studentRepository.save(student) != null;
	}

	@Transactional
	public void removeCourse(Long id) {
		logger.info("Servce Remoing Course");
		courseRepository.deleteById(id);
	}
	
	@Transactional
	public boolean approveStudent(Student student) {
		logger.info("Servce Approve Student");
		return studentRepository.save(student) != null;
	}
	
	

}
