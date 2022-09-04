package com.example.ssis_learning_backend.Service;

import com.example.ssis_learning_backend.Model.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> findAll();

    Optional<Course> findById(Long id);
}
