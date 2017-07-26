package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
    @RequestMapping(value = "/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello world");
        return "hello";
    }
}
