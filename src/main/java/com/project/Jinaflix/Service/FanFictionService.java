package com.project.Jinaflix.Service;

import com.project.Jinaflix.Entity.Fanfiction;
import com.project.Jinaflix.Entity.Member;
import com.project.Jinaflix.Repository.FanFictionRepository;
import com.project.Jinaflix.Repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FanFictionService {

    private final FanFictionRepository fanfictionRepository;
    private final MemberRepository memberRepository;


    public FanFictionService(FanFictionRepository fanfictionRepository, MemberRepository memberRepository) {
        this.fanfictionRepository = fanfictionRepository;
        this.memberRepository = memberRepository;
    }

    public Fanfiction createFanfiction(String title, String content, String tag, Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("Member not found with id: " + memberId));

        Fanfiction fanfiction = new Fanfiction();
        fanfiction.setTitle(title);
        fanfiction.setContent(content);
        fanfiction.setTag(tag);
        fanfiction.setMember(member);

        return fanfictionRepository.save(fanfiction);
    }
}