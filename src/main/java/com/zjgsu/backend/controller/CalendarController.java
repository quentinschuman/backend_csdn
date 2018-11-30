package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:05
 */
@Controller
public class CalendarController {

    @GetMapping("/calendar.html")
    public String calendar(){
        System.out.println("calendar");
        return "calendar";
    }
}
