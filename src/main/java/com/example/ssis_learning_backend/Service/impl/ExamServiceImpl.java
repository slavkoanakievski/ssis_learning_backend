package com.example.ssis_learning_backend.Service.impl;

import com.example.ssis_learning_backend.Model.entities.AnswerQuestion;
import com.example.ssis_learning_backend.Model.entities.Exam;
import com.example.ssis_learning_backend.Model.entities.Question;
import com.example.ssis_learning_backend.Repository.ExamRepository;
import com.example.ssis_learning_backend.Repository.QuestionRepository;
import com.example.ssis_learning_backend.Service.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;
    private final QuestionRepository questionRepository;

    public ExamServiceImpl(ExamRepository examRepository, QuestionRepository questionRepository) {
        this.examRepository = examRepository;
        this.questionRepository = questionRepository;
    }


    @Override
    public List<Exam> findAll() {
        return this.examRepository.findAll();
    }

    @Override
    public Exam findById(Long id) {
        return this.examRepository.findById(id).get();
    }

    @Override
    public Double submitAnswers(List<AnswerQuestion> answers) {
        Double percentCorrectAnswers = 0D;

        for(int i=0; i<answers.size(); i++){
            Question question = this.questionRepository.findById(answers.get(i).getId()).get();
            if(Objects.equals(question.getCorrectAnswer(), answers.get(i).getAnswer()))
            {
                percentCorrectAnswers += 1;
            }

        }
        return percentCorrectAnswers/answers.size() * 100;
    }
}