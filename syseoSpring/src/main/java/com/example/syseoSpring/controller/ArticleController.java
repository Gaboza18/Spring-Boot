package com.example.syseoSpring.controller;

import com.example.syseoSpring.dto.ArticleForm;
import com.example.syseoSpring.entity.Article;
import com.example.syseoSpring.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 어노테이션
public class ArticleController {

    @Autowired // Spring-boot가 미리 생성해놓은 객체를 가져다가 자동 연결한다
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){

        // logging 기능 대체

        log.info(form.toString());
        // System.out.println(form.toString());

        // JPA

        // 1. dto 변환 Entity

        Article article = form.toEntity();
        log.info(article.toString());
        // System.out.println(article.toString());

        // 2. Repository에게 Entity DB 안에 저장

        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        // System.out.println(saved.toString());

        return "";
    }
}

