package com.project.Jinaflix.Controller;

import com.project.Jinaflix.Service.FanFictionService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 작가 관련 여기!!!
@Controller
public class WriterController {
    private final FanFictionService fanfictionService;

    public WriterController(FanFictionService fanfictionService) {
        this.fanfictionService = fanfictionService;
    }
    @GetMapping("/writer")
    public String boardWriteForm() {

        return "작가홈페이지";
    }

    @PostMapping("/writer/create")
    public ResponseEntity<String> createFanfiction(
            @RequestParam String title,
            @RequestParam String content,
            @RequestParam String tag,
            @RequestParam Long memberId) {

        fanfictionService.createFanfiction(title, content, tag, memberId);
        return ResponseEntity.ok("Fanfiction created successfully!");
    }
}
