package com.example.syseoSpring.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity // DB가 해당 객체를 인식 가능하게 해준다
@AllArgsConstructor
@ToString
public class Article {

    @Id // 대표값을 지정
    @GeneratedValue // 1,2,3 .. 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
