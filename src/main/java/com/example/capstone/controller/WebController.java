package com.example.capstone.controller;

import com.example.capstone.data.Member;
import com.example.capstone.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class WebController {
    @Autowired
    private MemberRepository memberRepository;


    @GetMapping("/")
    public String index(Model model) {
        Optional<Member> SMember = memberRepository.findById("220316M010116001");
        model.addAttribute("member", SMember.get().getMemberName());
        return "index";
    }
}
