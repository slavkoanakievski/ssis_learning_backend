package com.example.ssis_learning_backend.Model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerQuestion {
    private Long id;
    private Integer answer;
}