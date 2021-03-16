package com.example.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/web",method = RequestMethod.GET)
public class UserLoginController {
    @RequestMapping(value = "/userlogin",method = RequestMethod.GET)
    public String UserLogin(){
        return "welcome to springboot study";
    }
}
