package com.example.aritcledemo.Article.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.aritcledemo.Article.Dto.ArticleDTO;
import com.example.aritcledemo.Article.Entity.ArticleEntity;
import com.example.aritcledemo.Article.Repository.ArticleRepository;

@Service
public class ArticleService {
  private final ArticleRepository articleRepository;

  public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  public Page<ArticleDTO> findPage(Pageable pageable) {
    Page<ArticleEntity> articlePage = articleRepository.findAllByOrderByNewsTimeDesc(pageable);
    return articlePage.map(ArticleDTO::toArticleDTO);
  }

  public ArticleDTO findArticleById(Long id) {
    ArticleEntity articleEntity = articleRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("뉴스 기사를 찾을 수 없습니다: " + id));
    return ArticleDTO.toArticleDTO(articleEntity);
  }
}