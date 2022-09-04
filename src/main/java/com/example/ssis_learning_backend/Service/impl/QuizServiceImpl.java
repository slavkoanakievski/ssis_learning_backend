package com.example.ssis_learning_backend.Service.impl;

import com.example.ssis_learning_backend.Model.entities.Quiz;
import com.example.ssis_learning_backend.Repository.QuizRepository;
import com.example.ssis_learning_backend.Service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public List<Quiz> findAll() {
        return this.quizRepository.findAll();
    }

    @Override
    public Quiz findById(Long id) {
        return this.quizRepository.findById(id).orElseThrow(()->new NoSuchElementException());
    }
}
