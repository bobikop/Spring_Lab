package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {

    @RequestMapping("/lab")
    public String labTable(Model model){

        model.addAttribute("firstLab","lab-00-coupling");
        model.addAttribute("secondLab","lab-01-IoC");
        model.addAttribute("thirdLab","lab-02-Spring Boot");
        model.addAttribute("fourthLab","lab-03-Spring MVC");
        model.addAttribute("fifthLab","lab-04-Thymeleaf");



        return "lab/lab-list";
    }


}
