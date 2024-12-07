package com.project.Jinaflix.Entity;

import com.project.Jinaflix.Entity.Member;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
public class Fanfiction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fanfiction_id;

    @Column(nullable = false)
    private String Title;

    @Column(nullable = false)
    private String Content;

    @Column
    private String tag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
