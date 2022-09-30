package com.example.ssis_learning_backend.Repository;


import com.example.ssis_learning_backend.Model.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
