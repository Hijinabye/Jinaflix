package com.project.Jinaflix.Entity;

import com.project.Jinaflix.Entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content; // 리뷰 내용

    @Column(nullable = false)
    private int rating; // 평점 (1~5점)

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now(); // 작성 시간

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fanfiction_id")
    private com.project.Jinaflix.Entity.Fanfiction fanfiction; // 리뷰 대상 작품

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 리뷰 작성자
}