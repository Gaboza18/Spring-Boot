package com.example.syseoSpring.repository;

import com.example.syseoSpring.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
