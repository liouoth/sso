package com.leo.ssoserver.controller;

import com.leo.ssoserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/sso")
public class LoginControler {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "/login.html";
    }

    @RequestMapping("/doLogin")
    public ModelAndView doLogin(HttpServletResponse response, @RequestParam String user,@RequestParam String password){

        return null;
    }
}
