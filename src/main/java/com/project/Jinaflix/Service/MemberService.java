package com.project.Jinaflix.Service;

import com.project.Jinaflix.Entity.Member;
import com.project.Jinaflix.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void registerMember(Member member) {
        if (memberRepository.existsByEmail(member.getEmail())) {
            throw new IllegalArgumentException("이미 사용 중인 이메일입니다.");
        }
        memberRepository.save(member);
    }

    public boolean login(String email, String password) {
        // 이메일과 비밀번호로 사용자 조회
        Member member = memberRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));

        System.out.println(member.getEmail());
        System.out.println(member.getPassword());
        // 비밀번호 일치 여부 확인
        if (!member.getPassword().equals(password)) {
            return false;
        }

        // 로그인 성공
        return true;
    }
}