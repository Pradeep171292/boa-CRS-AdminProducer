package com.boa.crs.repo;

import org.springframework.data.repository.CrudRepository;

import com.boa.crs.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
