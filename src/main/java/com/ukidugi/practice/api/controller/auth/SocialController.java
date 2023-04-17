package com.ukidugi.practice.api.controller.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class SocialController {

    @GetMapping("/oauth2/code/kakao")
    public String refreshToken(@RequestParam String code) {

        return code;
    }
}
