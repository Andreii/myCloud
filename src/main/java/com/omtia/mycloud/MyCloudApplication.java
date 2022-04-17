package com.omtia.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MyCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudApplication.class, args);
    }

    @RequestMapping("/user")
    public String user(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttribute("name");
    }
}
