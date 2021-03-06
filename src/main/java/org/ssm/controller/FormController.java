package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "form")
public class FormController {
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName){
        System.out.println("动态跳转页面，调用loginForm方法");
        return "pages1/"+formName;
    }
}
