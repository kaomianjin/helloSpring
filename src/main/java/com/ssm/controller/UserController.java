package com.ssm.controller;


import com.ssm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/select")
    public ModelAndView test() throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("index.jsp",userService.select());
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
