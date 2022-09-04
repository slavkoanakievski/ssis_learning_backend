package com.example.ssis_learning_backend.Service;



import com.example.ssis_learning_backend.Model.entities.AnswerQuestion;
import com.example.ssis_learning_backend.Model.entities.Exam;

import java.util.List;

public interface ExamService {

    List<Exam> findAll();

    Exam findById(Long id);

    Double submitAnswers(List<AnswerQuestion> answers);
}