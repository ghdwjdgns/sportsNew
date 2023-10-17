package com.example.aritcledemo.Article.Dto;

import com.example.aritcledemo.Article.Entity.ArticleEntity;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ArticleDTO {
    private Long id;
    private String title;
    private String content;
    private String url;
    private String news_content;
    private String press;
    private String news_time;
    private String image_url;

    public static ArticleDTO toArticleDTO(ArticleEntity articleEntity) {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setId(articleEntity.getId());
        articleDTO.setTitle(articleEntity.getTitle());
        articleDTO.setContent(articleEntity.getContent());
        articleDTO.setUrl(articleEntity.getUrl());
        articleDTO.setNews_content(articleEntity.getNewsContent());
        articleDTO.setPress(articleEntity.getPress());
        articleDTO.setNews_time(articleEntity.getNewsTime());
        articleDTO.setImage_url(articleEntity.getImageUrl());
        return articleDTO;
    }
}