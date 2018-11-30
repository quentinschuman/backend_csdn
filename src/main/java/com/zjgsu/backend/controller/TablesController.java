package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 19:45
 */
@Controller
public class TablesController {

    @GetMapping("/table-static.html")
    public String tableStatic(){
        System.out.println("tableStatic");
        return "table-static";
    }

    @GetMapping("/table-responsive.html")
    public String tableResponsive(){
        System.out.println("tableResponsive");
        return "table-responsive";
    }

    @GetMapping("/table-datatable.html")
    public String tableDatatable(){
        System.out.println("tableDatatable");
        return "table-datatable";
    }

}
