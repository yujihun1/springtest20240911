package com.example.sbb.article;

import com.example.sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(length = 200)
    private String title;

    @Column(columnDefinition = "TEXT")
    private  String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "article",cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
