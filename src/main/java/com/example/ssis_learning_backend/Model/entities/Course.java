package com.example.ssis_learning_backend.Model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String category;

    private String level;

    private String duration;


    @ElementCollection
    private List<String> lectures;

    public Course(String title, String category, String level, String duration, List<String> lectures) {
        this.title = title;
        this.category = category;
        this.level = level;
        this.duration = duration;
        this.lectures = lectures;
    }

    public Course() {
    }
}
