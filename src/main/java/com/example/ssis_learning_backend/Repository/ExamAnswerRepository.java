package com.example.ssis_learning_backend.Repository;

import com.example.ssis_learning_backend.Model.entities.ExamAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamAnswerRepository extends JpaRepository<ExamAnswer, Long> {
}