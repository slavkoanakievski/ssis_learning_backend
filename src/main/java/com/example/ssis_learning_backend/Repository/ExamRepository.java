package com.example.ssis_learning_backend.Repository;

import com.example.ssis_learning_backend.Model.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}