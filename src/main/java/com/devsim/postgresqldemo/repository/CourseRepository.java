package com.devsim.postgresqldemo.repository;

import com.devsim.postgresqldemo.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CourseRepository extends CrudRepository<Course, UUID> { }
