package com.zjgsu.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: backend_csdn
 * User: quent
 * Date: 2018/11/30
 * Time: 19:53
 */
@Controller
public class FormsController {

    @GetMapping("/form-basic.html")
    public String formBasic(){
        System.out.println("formBasic");
        return "form-basic";
    }

    @GetMapping("/form-element.html")
    public String fromElement(){
        System.out.println("formElement");
        return "form-element";
    }

    @GetMapping("/form-wizard.html")
    public String formWizard(){
        System.out.println("formWizard");
        return "form-wizard";
    }

    @GetMapping("/form-pickers.html")
    public String formPickers(){
        System.out.println("formPickers");
        return "form-pickers";
    }

    @GetMapping("/form-validation.html")
    public String formValidation(){
        System.out.println("formValidation");
        return "form-validation";
    }

    @GetMapping("/image-crop.html")
    public String imageCrop(){
        System.out.println("imageCrop");
        return "image-Crop";
    }

    @GetMapping("/form-xeditable.html")
    public String formXeditable(){
        System.out.println("formXeditable");
        return "form-xeditable";
    }

    @GetMapping("/form-editors.html")
    public String formEditors(){
        System.out.println("formEditors");
        return "form-editors";
    }

    @GetMapping("/form-upload.html")
    public String formUpload(){
        System.out.println("formUpload");
        return "form-upload";
    }
}
