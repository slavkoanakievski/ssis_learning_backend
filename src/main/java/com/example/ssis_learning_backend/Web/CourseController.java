package com.example.ssis_learning_backend.Web;

import com.example.ssis_learning_backend.Model.entities.Course;
import com.example.ssis_learning_backend.Model.entities.Lecture;
import com.example.ssis_learning_backend.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(value = "*")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return this.courseService.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        return this.courseService.findById(id);
    }


}
