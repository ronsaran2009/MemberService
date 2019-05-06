package com.example.Recipe;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class MemberController {
    @RequestMapping("/Member/{memberId}")
    public Member getMember(@PathVariable String memberId){
        return MemberService.getMember(memberId) ;
    }

    //ADD Member
    @PostMapping("/Menber/{id}/Proflie")
    public String addMember(@PathVariable  String id, Member member) throws ExecutionException, InterruptedException, IOException {
        return  MemberService.addMember(id, member.getEmail(), member.getPassword(), member.getName());

    }
}
