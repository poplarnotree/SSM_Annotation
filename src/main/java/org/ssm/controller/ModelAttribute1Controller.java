package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping(value = "form")
public class ModelAttribute1Controller {
    /**
     * 在类中首先访问的就是ModelAttribute,
     * 因为设置了参数，
     * 因此上一个页面需要有loginname的值传过来，否则报错。
     */
    @ModelAttribute("loginname")
    public String userModel1(
            @RequestParam("loginname") String loginname){
        System.out.println("调用FormController类中的userModel1方法");
        return "pages1/"+loginname;
    }
    @RequestMapping(value = "/login1")
    public String login1(){
        System.out.println("调用FormController类中的login1方法");
        return "pages1/welcome";
    }

}
