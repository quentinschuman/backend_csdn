package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 19:50
 */
@Controller
public class MailController {

    @GetMapping("/inbox.html")
    public String inBox(){
        System.out.println("inBox");
        return "inbox";
    }

    @GetMapping("/compose.html")
    public String compose(){
        System.out.println("compose");
        return "compose";
    }

    @GetMapping("/message-view.html")
    public String messageView(){
        System.out.println("messageView");
        return "message-view";
    }

}
