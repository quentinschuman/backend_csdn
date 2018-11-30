package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:10
 */
@Controller
public class MapsController {

    @GetMapping("/google-map.html")
    public String googleMap(){
        System.out.println("googleMap");
        return "google-map";
    }

    @GetMapping("/vector-map.html")
    public String vectorMap(){
        System.out.println("vectorMap");
        return "vector-map";
    }
}
