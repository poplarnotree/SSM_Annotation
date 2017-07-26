package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "form")
@Controller
public class ModelAttribute4Controller {
//    此时login4方法的返回值并不是一个视图名称，而是model属性的值，视图名称是@RequestMapping
//    的value值"login4"
//    Model的属性名称由@ModelAttribute(value="")指定，相当于在request中封装了
//    username(key)=admin(value)
    @RequestMapping(value = "/login4")
    @ModelAttribute(value = "username")
    public String login4(){
        System.out.println("调用login4");
        return "admin";
    }
}
