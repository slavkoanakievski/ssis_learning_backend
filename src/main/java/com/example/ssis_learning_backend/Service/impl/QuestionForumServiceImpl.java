package com.example.ssis_learning_backend.Service.impl;

import com.example.ssis_learning_backend.Model.entities.QuestionForum;
import com.example.ssis_learning_backend.Repository.QuestionForumRepository;
import com.example.ssis_learning_backend.Service.QuestionForumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionForumServiceImpl implements QuestionForumService {

    private final QuestionForumRepository questionForumRepository;

    public QuestionForumServiceImpl(QuestionForumRepository questionForumRepository) {
        this.questionForumRepository = questionForumRepository;
    }

    @Override
    public List<QuestionForum> findAll() {
        return this.questionForumRepository.findAll();
    }

}
