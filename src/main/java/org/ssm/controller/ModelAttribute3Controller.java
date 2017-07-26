package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssm.entity.User;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping(value = "form")
public class ModelAttribute3Controller {
    private static List<User> userList;

    public ModelAttribute3Controller() {
        super();
        userList = new ArrayList<User>();
        User user1 = new User("test","123456","测试用户");
        User user2 = new User("admin","123456","管理员");
        userList.add(user1);
        userList.add(user2);
        System.out.println("-----------1");
    }
    public User find(String loginname,String password){
        for(User user : userList){
            if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
                System.out.println("--------------2");
                System.out.println(user.getLoginname());
                return user;
            }
        }
        return null;
    }

//     model属性的名称没有被指定，它由返回类型隐含表示，如这个方法返回User类型，那么这个model
//     属性的名称是user
    @ModelAttribute
    public User userModel3(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password){
        return find(loginname,password);
    }
    @RequestMapping(value = "/login3")
    public String login3(){
        System.out.println("调用ModelAttribute3Controller中的login3方法");
        return "pages1/welcome";
    }

}
