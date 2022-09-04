package com.example.ssis_learning_backend.Web;

import com.example.ssis_learning_backend.Model.entities.AnswerQuestion;
import com.example.ssis_learning_backend.Model.entities.Course;
import com.example.ssis_learning_backend.Model.entities.Exam;
import com.example.ssis_learning_backend.Service.CourseService;
import com.example.ssis_learning_backend.Service.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(value = "*")
public class CourseController {
    private final CourseService courseService;
    private final ExamService examService;

    public CourseController(CourseService courseService, ExamService examService) {
        this.courseService = courseService;
        this.examService = examService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return this.courseService.findAll();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id) {
        return this.courseService.findById(id);
    }

    @GetMapping("/exams")
    public List<Exam> getAllExams() {
        return this.examService.findAll();
    }

    @GetMapping("/exams/{id}")
    public Exam getExam(@PathVariable Long id) {
        return this.examService.findById(id);
    }

    @PostMapping("/exam/{id}/submit")
    public Double submitAnswers(@PathVariable Long id, @RequestBody List<AnswerQuestion> answers)
    {
        return this.examService.submitAnswers(answers);
    }

}
