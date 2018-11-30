package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:06
 */
@Controller
public class WidgetController {

    @GetMapping("/widget.html")
    public String widget(){
        System.out.println("widget");
        return "widget";
    }
}
