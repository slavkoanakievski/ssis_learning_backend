package com.example.ssis_learning_backend.Model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Getter
@Setter
public class Course {

    private static final String DATE_FORMATTER= "yyyy-MM-dd";
    public String getFormattedDatePublished() {
        return "Created:: " + DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.dateCreated) + ", "+ this.dateCreated.getDayOfWeek();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String category;

    private String level;

    private String duration;

    private LocalDateTime dateCreated;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    private String rating;

    private Integer studentsEnrolled;

    @ElementCollection
    private List<String> lectures;

    public String getFormattedDateCreated() {
        return DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.dateCreated) + ", "+ this.dateCreated.getDayOfWeek();
    }

    public Course(String title, String category, String level, String duration, LocalDateTime dateCreated, String description, String rating, Integer studentsEnrolled, List<String> lectures) {
        this.title = title;
        this.category = category;
        this.level = level;
        this.duration = duration;
        this.dateCreated = dateCreated;
        this.description = description;
        this.rating = rating;
        this.studentsEnrolled = studentsEnrolled;
        this.lectures = lectures;
    }

    public Course() {
    }
}
