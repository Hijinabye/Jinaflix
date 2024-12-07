package com.project.Jinaflix.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chapter_id;

    @Column(nullable = false)
    private String title; // 목차 제목

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content; // 목차 내용

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fanfiction_id") // 팬픽션과 연결
    private com.project.Jinaflix.Entity.Fanfiction fanfiction;
}
