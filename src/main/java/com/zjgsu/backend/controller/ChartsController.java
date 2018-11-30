package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 20:07
 */
@Controller
public class ChartsController {

    @GetMapping("/flot-chart.html")
    public String flotChart(){
        System.out.println("flotChart");
        return "flot-chart";
    }

    @GetMapping("/morris-chart.html")
    public String morrisChart(){
        System.out.println("morrisChart");
        return "morris-chart";
    }

    @GetMapping("/chart-js.html")
    public String chartJS(){
        System.out.println("chartJS");
        return "chart-js";
    }

    @GetMapping("/chart-sparkline.html")
    public String chartSparkline(){
        System.out.println("chartSparkline");
        return "chart-sparkline";
    }
}
