package com.project.Jinaflix.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column
    private String gender;

    @Column
    private String role; // 작가인지 읽는 사람인지


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
//    @Column
//    private String profileImage; // 이미지 경로 저장
}
