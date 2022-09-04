package com.example.ssis_learning_backend.Web;

import com.example.ssis_learning_backend.Model.entities.Course;
import com.example.ssis_learning_backend.Model.entities.Quiz;
import com.example.ssis_learning_backend.Service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
@CrossOrigin(value = "*")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return this.quizService.findAll();
    }
    @GetMapping("/{id}")
    public Quiz getCourse(@PathVariable Long id) {
        return this.quizService.findById(id);
    }

}
