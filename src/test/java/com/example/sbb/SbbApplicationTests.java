package com.example.sbb;

import com.example.sbb.article.Article;
import com.example.sbb.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void contextLoads() {
		Article article= new Article();
		article.setTitle("예시용질문");
		article.setContent("예시용 답볍");
		article.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article);
	}

}
