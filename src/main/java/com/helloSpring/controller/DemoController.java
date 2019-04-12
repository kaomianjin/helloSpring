package com.helloSpring.controller;


import com.helloSpring.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Resource
    DemoService userService;

    @RequestMapping("/select")
    public ModelAndView test() throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("size",userService.select().size());
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
