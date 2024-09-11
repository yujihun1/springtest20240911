package com.example.sbb.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ArticleController {
 private final ArticleRepository articleRepository;

    @GetMapping("/article/list")
    public String list(Model model){
        List<Article> aritlceList = this.articleRepository.findAll();
        model.addAttribute("articleList",aritlceList);
        return "article_list";
    }
}
