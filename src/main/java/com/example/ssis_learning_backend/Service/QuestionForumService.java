package com.example.ssis_learning_backend.Service;


import com.example.ssis_learning_backend.Model.entities.QuestionForum;

import java.util.List;

public interface QuestionForumService {
    List<QuestionForum> findAll();
}
