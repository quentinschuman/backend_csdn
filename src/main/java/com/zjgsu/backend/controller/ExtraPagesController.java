package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:12
 */
@Controller
public class ExtraPagesController {

    @GetMapping("/faq.html")
    public String faq(){
        System.out.println("faq");
        return "faq";
    }

    @GetMapping("/profile.html")
    public String profile(){
        System.out.println("profile");
        return "profile";
    }

    @GetMapping("/invoice.html")
    public String invoice(){
        System.out.println("invoice");
        return "invoice";
    }

    @GetMapping("/timeline.html")
    public String timeline(){
        System.out.println("timeline");
        return "timeline";
    }

    @GetMapping("/email-template.html")
    public String emailTemplate(){
        System.out.println("emailTemplate");
        return "email-template";
    }

    @GetMapping("/pricing-table.html")
    public String pricingTable(){
        System.out.println("pricingTable");
        return "pricing-table";
    }

    @GetMapping("/search-result.html")
    public String searchResult(){
        System.out.println("searchResult");
        return "search-result";
    }

    @GetMapping("/error-400.html")
    public String error400(){
        System.out.println("error400");
        return "error-400";
    }

    @GetMapping("/error-403.html")
    public String error403(){
        System.out.println("error403");
        return "error-403";
    }

    @GetMapping("/error-404.html")
    public String error404(){
        System.out.println("error404");
        return "error-404";
    }

    @GetMapping("/error-500.html")
    public String error500(){
        System.out.println("error500");
        return "error-500";
    }

    @GetMapping("/error-503.html")
    public String error503(){
        System.out.println("error503");
        return "error-503";
    }
}
