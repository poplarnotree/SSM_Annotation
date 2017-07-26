package org.ssm.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssm.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟登陆
 * @RequestMapping 不仅可以用来注释类中的方法，还能用来注释控制器类
 * 这里表示所有的请求都被映射到value属性所指示的路径下，也就是user下
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static List<User> userList;
    //构造函数 初始化List集合
    public UserController() {
        super();
        userList = new ArrayList<User>();
    }

    //静态日志类LogFactory 只是打印日志，与其他无关
    private  static final Log logger = LogFactory.getLog(UserController.class);
    //下面这个方法仅仅支持GET请求,同时映射到的是/user/register
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String registerForm(){
        logger.info("register GET方法被调用....");
        return "registerForm";
    }

    //下面这个方法仅仅支持POST请求,同时映射到的是/user/register
    @RequestMapping(value = "register",method = RequestMethod.POST)
    //将请求中的loginname，password，username参数分别赋值给变量loginname，password，username
    public String register(@RequestParam("loginname")String loginname,
                           @RequestParam("password")String password,
                           @RequestParam("username")String username){

        logger.info("register POST方法被调用");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        userList.add(user);
        return "loginForm";
    }
    //映射请求 user/login
    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password,
            Model model){
        logger.info("登录名:"+loginname+",密码:"+password);
        for(User user : userList){
            if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome";
            }
        }
        return "loginForm";
    }


}
