package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:00
 */
@Controller
public class IconsController {

    @GetMapping("/icon-font-awesome.html")
    public String iconFontAwesome(){
        System.out.println("iconFontAwesome");
        return "icon-font-awesome";
    }

    @GetMapping("/icon-simple-lineicon.html")
    public String iconSimpleLineicon(){
        System.out.println("iconSimpleLineicon");
        return "icon-simple-lineicon";
    }

    @GetMapping("/icon-themify.html")
    public String iconThemify(){
        System.out.println("iconThemify");
        return "icon-themify";
    }

    @GetMapping("/icon-material-design.html")
    public String iconMaterialDesign(){
        System.out.println("iconMaterialDesign");
        return "icon-material-design";
    }

    @GetMapping("/icon-ion.html")
    public String iconIon(){
        System.out.println("iconIon");
        return "icon-ion";
    }

}
