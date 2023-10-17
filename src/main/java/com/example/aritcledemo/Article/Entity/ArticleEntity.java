package com.example.aritcledemo.Article.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "news")
public class ArticleEntity {
    @Id
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "url")
    private String url;
    @Column(name = "news_content")
    private String newsContent;
    @Column(name = "press")
    private String press;
    @Column(name = "news_time")
    private String newsTime;
    @Column(name = "image_url")
    private String imageUrl;


}

