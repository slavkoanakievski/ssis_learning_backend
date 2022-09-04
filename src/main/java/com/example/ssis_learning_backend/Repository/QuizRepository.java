package com.example.ssis_learning_backend.Repository;

import com.example.ssis_learning_backend.Model.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>  {
}


