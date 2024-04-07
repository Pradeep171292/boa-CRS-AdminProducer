package com.boa.crs.repo;

import org.springframework.data.repository.CrudRepository;

import com.boa.crs.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
