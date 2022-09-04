package com.example.ssis_learning_backend.Model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private Integer rating;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    public Lecture(String title, Integer rating, String description) {
        this.title = title;
        this.rating = rating;
        this.description = description;
    }

    public Lecture() {
    }
}
