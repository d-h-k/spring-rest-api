package com.example.springrestapi.member;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/v1/api")
public class MemberController {

    private MemberRepo memberRepo;

    @GetMapping
    Page<Member> pageableTest_GetManyMem(Pageable pageable) {
        Page<Member> memberPage = memberRepo.findAll(pageable);
        return memberPage;
    }


    @GetMapping("dto")
    Page<?> pageableTest_GetDtoMany(Pageable pageable) {
        Page<Member> memberPage = memberRepo.findAll(pageable);
        return memberPage;
    }


}
