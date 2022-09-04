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
public class QuestionForum {

    private static final String DATE_FORMATTER= "yyyy-MM-dd";
    public String getFormattedDatePublished() {
        return "Posted: " + DateTimeFormatter.ofPattern(DATE_FORMATTER).format(this.datePosted) + ", "+ this.datePosted.getDayOfWeek();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(columnDefinition = "LONGTEXT")
    private String questionForumText;

    private LocalDateTime datePosted;


    @ElementCollection
    private List<String> answers;


    public QuestionForum(String questionForumText, LocalDateTime datePosted, List<String> answers) {
        this.questionForumText = questionForumText;
        this.datePosted = datePosted;
        this.answers = answers;
    }

    public QuestionForum() {
    }
}
