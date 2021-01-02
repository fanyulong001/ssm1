package com.abc.handler;

import com.abc.beans.User;
import com.abc.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/test")
public class UserHandler {
    @Resource
    IUserService userService;
    @RequestMapping("/register.do")
    public String register(User user){
       userService.addUser(user);
        return "/welcome.jsp";
    }
}
