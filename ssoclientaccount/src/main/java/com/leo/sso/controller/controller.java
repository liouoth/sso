package com.leo.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class controller {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "this is your account center";
    }
}
