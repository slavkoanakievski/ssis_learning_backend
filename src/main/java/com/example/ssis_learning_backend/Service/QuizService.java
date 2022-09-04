package com.example.ssis_learning_backend.Service;


import com.example.ssis_learning_backend.Model.entities.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> findAll();
    Quiz findById(Long id);
}
