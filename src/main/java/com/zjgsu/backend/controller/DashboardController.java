package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:54
 */
@Controller
public class DashboardController {

    @GetMapping("/index.html")
    public String dashboard1(){
        System.out.println("dashboard1");
        return "index";
    }

    @GetMapping("/dashboard2.html")
    public String dashboard2(){
        System.out.println("dashboard2");
        return "dashboard2";
    }
}
