package com.example.capstone.controller;

import com.example.capstone.data.Member;
import com.example.capstone.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private MemberRepository memberRepository;

    String SMemberName;

    @GetMapping("/shop")
    public String index() {
        Optional<Member> SMember = memberRepository.findById("220316M010116001");
        SMemberName = SMember.get().getMemberName();
        System.out.println(SMemberName + "   aaa");
        return SMemberName;
    }
}
