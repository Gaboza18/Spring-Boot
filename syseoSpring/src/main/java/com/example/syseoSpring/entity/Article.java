package com.example.syseoSpring.entity;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity // DB가 해당 객체를 인식 가능하게 해준다
public class Article {

    @Id // 대표값을 지정
    @GeneratedValue // 1,2,3 .. 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    // 생성자 추가
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}