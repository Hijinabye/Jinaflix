package com.project.Jinaflix.Controller;


import com.project.Jinaflix.Entity.Member;
import com.project.Jinaflix.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignController
{
    @GetMapping("/login") //localhost:8090/board/write
    public String boardWriteForm() {

        return "login";
    }

    @GetMapping("/register") //localhost:8090/board/write
    public String board() {

        return "register";
    }

    @GetMapping("/readerVSwriter") //localhost:8090/board/write
    public String readerWriter() {

        return "독자VS작가";
    }

    @GetMapping("/writerhome") //localhost:8090/board/write
    public String writerHome() {

        return "작가홈페이지";
    }

    @GetMapping("/writerwrite") //localhost:8090/board/write
    public String writerWrite() {

        return "작가페이지";
    }

    @GetMapping("/JInFlIx") //localhost:8090/board/write
    public String mainHomePage() {

        return "home";
    }

    @GetMapping("/fanfic") //localhost:8090/board/write
    public String fanFic() {

        return "작품01상세페이지";
    }

    @GetMapping("/readfanfic") //localhost:8090/board/write
    public String readFanfic() {

        return "빙의글01";
    }

    @GetMapping("/genre") //localhost:8090/board/write
    public String genre() {

        return "장르";
    }

    @Autowired
    private MemberService memberService;

    @GetMapping
    public String registerForm() {
        return "register"; // 회원가입 HTML 파일 경로
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Member member, Model model) {
        try {
            memberService.registerMember(member);
            model.addAttribute("message", "회원가입이 완료되었습니다.");
            return "redirect:/login"; // 회원가입 후 로그인 페이지로 이동
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "register";
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestParam(value="email") String email, @RequestParam(value="password") String password) {
        // 로그인 검증
        boolean isLoggedIn = memberService.login(email, password);

        if (isLoggedIn) {
            // 로그인 성공 시 /choose로 리다이렉트
            return ResponseEntity.status(HttpStatus.FOUND).header("Location", "/readerVSwriter").build();
        } else {
            // 로그인 실패 시 401 응답
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
