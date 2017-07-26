package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssm.entity.User;

@Controller
@RequestMapping("form")
public class ModelAttribute5Controller {
    //model属性名称就是value值，即"user"，model 属性对象就是方法的返回值
    @ModelAttribute("user")
    public User userModel5(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password){
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        return user;
    }
//   @ModelAttribute("user")User user 注解方法参数，参数user的值就是userModel5()方法种的model属性。
    @RequestMapping(value = "/login5")
    public String login5(@ModelAttribute("user")User user){
        user.setUsername("管理员");
        return "pages1/welcome";
    }
}
