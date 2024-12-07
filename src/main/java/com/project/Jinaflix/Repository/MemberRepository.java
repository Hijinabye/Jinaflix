package com.project.Jinaflix.Repository;



import com.project.Jinaflix.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByEmail(String email); // 이메일 중복 확인용
    Member findByEmailAndPassword(String email, String password);

    Optional<Member> findByEmail(String email);
}
