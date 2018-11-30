package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 19:35
 */
@Controller
public class UiElementController {

    @GetMapping("/ui-buttons.html")
    public String uiButtons(){
        System.out.println("uiButtons");
        return "ui-buttons";
    }

    @GetMapping("/ui-panels.html")
    public String uiPanels(){
        System.out.println("uiPanels");
        return "ui-panels";
    }

    @GetMapping("/ui-sweet-alert.html")
    public String uiSweetAlert(){
        System.out.println("uiSweetAlert");
        return "ui-sweet-alert";
    }

    @GetMapping("/ui-progressbar.html")
    public String uiProgressbar(){
        System.out.println("uiProgressbar");
        return "ui-progressbar";
    }

    @GetMapping("/ui-alert-notification.html")
    public String uiAlertNotification(){
        System.out.println("uiAlertNotification");
        return "ui-alert-notification";
    }

    @GetMapping("/ui-checkbox-radio.html")
    public String uiCheckboxRadio(){
        System.out.println("uiCheckboxRadio");
        return "ui-checkbox-radio";
    }

    @GetMapping("/ui-range-slider.html")
    public String uiRangeSlider(){
        System.out.println("uiRangeSlider");
        return "ui-range-slider";
    }

    @GetMapping("/ui-modals-tooltip.html")
    public String uiModalsTooltip(){
        System.out.println("uiModalsTooltip");
        return "ui-modals-tooltip";
    }

    @GetMapping("/typography.html")
    public String typography(){
        System.out.println("typography");
        return "typography";
    }
}
