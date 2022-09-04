package com.example.ssis_learning_backend.Service.impl;

import com.example.ssis_learning_backend.Model.entities.Course;
import com.example.ssis_learning_backend.Repository.CourseRepository;
import com.example.ssis_learning_backend.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAll() {
       return this.courseRepository.findAll();
    }

    @Override
    public Optional<Course> findById(Long id) {
        return this.courseRepository.findById(id);
    }
}
