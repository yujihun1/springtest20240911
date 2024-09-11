package com.example.sbb.answer;

import com.example.sbb.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
