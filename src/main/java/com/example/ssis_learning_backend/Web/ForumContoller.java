package com.example.ssis_learning_backend.Web;

import com.example.ssis_learning_backend.Model.entities.QuestionForum;
import com.example.ssis_learning_backend.Model.entities.QuestionForumResourceDto;
import com.example.ssis_learning_backend.Model.entities.Quiz;
import com.example.ssis_learning_backend.Service.QuestionForumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(value = "*")
public class ForumContoller {
    private final QuestionForumService questionForumService;

    public ForumContoller(QuestionForumService questionForumService) {
        this.questionForumService = questionForumService;
    }

    @GetMapping
    public List<QuestionForum> getAllForumQuestions() {
        return this.questionForumService.findAll();
    }

    @PostMapping("/addQuestion")
    public QuestionForum addCommunityLink(@RequestBody QuestionForumResourceDto questionForumResourceDto ) {
        return this.questionForumService.addCommunityLink(questionForumResourceDto);
    }
}


