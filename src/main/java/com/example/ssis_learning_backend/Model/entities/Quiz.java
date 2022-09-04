package com.example.ssis_learning_backend.Model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
public class Quiz {

    private static final String DATE_FORMATTER= "yyyy-MM-dd";
    public String getFormattedDatePublished() {
        return "Created:: " + DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.dateCreated) + ", "+ this.dateCreated.getDayOfWeek();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String level;

    private LocalDateTime dateCreated;

    private String duration;

    private String code;

    private String category;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column(columnDefinition = "LONGTEXT")
    private String typeOfQuestionsExplain;

    public String getFormattedDateCreated() {
        return DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.dateCreated) + ", "+ this.dateCreated.getDayOfWeek();
    }

    public Quiz(String title, String level, LocalDateTime dateCreated, String duration, String code, String category, String description, String typeOfQuestionsExplain) {
        this.title = title;
        this.level = level;
        this.dateCreated = dateCreated;
        this.duration = duration;
        this.code = code;
        this.category = category;
        this.description = description;
        this.typeOfQuestionsExplain = typeOfQuestionsExplain;
    }

    public Quiz() {
    }
}
