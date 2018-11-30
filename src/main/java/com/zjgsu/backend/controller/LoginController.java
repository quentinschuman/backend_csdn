package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:57
 */
@Controller
public class LoginController {

    @GetMapping("/login.html")
    public String loginPannel(){
        System.out.println("login-pannel");
        return "login";
    }

    @GetMapping("/forgot-password.html")
    public String forgotPassword(){
        System.out.println("forgotPassword");
        return "forgot-password";
    }

//    @GetMapping("/registration.html")
//    public String registration(){
//        System.out.println("registration");
//        return "registration";
//    }

    @GetMapping("/locked.html")
    public String locked(){
        System.out.println("locked");
        return "locked";
    }
}
