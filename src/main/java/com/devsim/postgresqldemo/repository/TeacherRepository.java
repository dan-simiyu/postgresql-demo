package com.devsim.postgresqldemo.repository;

import com.devsim.postgresqldemo.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherRepository extends CrudRepository<Teacher, UUID> { }
