package com.example.ssis_learning_backend.Repository;

import com.example.ssis_learning_backend.Model.entities.QuestionForum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionForum, Long> {
}
