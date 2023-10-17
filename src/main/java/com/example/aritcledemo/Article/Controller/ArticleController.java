package com.example.aritcledemo.Article.Controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.aritcledemo.Article.Dto.ArticleDTO;
import com.example.aritcledemo.Article.Service.ArticleService;

@RestController
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/api/articles")
    public Page<ArticleDTO> listArticlesByPage(
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "9") int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return articleService.findPage(pageable);
    }

    @GetMapping("/api/articles/{id}")
    public ArticleDTO getArticleById(@PathVariable Long id) {
        return articleService.findArticleById(id);
    }
}
