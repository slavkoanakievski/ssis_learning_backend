package com.example.ssis_learning_backend.Model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class ExamAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Exam exam;

    @ElementCollection
    private List<Integer> userAnswers;


    public ExamAnswer(Exam exam, List<Integer> answers) {
        this.exam = exam;
        this.userAnswers = answers;
    }

    public ExamAnswer() {
    }
}