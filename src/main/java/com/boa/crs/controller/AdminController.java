package com.boa.crs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.entity.Course;
import com.boa.crs.entity.Professor;
import com.boa.crs.entity.Student;
import com.boa.crs.service.AdminService;


@RestController
@RequestMapping("/Admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/addProfessor", method = RequestMethod.POST)
	public HttpStatus addProfessor(@RequestBody Professor professor) {
		logger.info("Controller Adding  Professor");
		return adminService.addProfessor(professor) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/addCourse", method = RequestMethod.POST)
	public HttpStatus addCourse(@RequestBody Course course) {
		logger.info("Controller Adding  Course");
		return adminService.addCourse(course) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public HttpStatus addStudent(@RequestBody Student student) {
		logger.info("Controller Adding  Course");
		return adminService.addStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/removeCourse/{id}", method = RequestMethod.DELETE)
	public HttpStatus removeCourse(@PathVariable Long id) {
		logger.info("Controller Remove Course");
		adminService.removeCourse(id);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/approveStudent", method = RequestMethod.PUT)
	public HttpStatus approveStudent(@RequestBody Student student) {
		logger.info("Controller Approve Student");
		return adminService.approveStudent(student) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
}
