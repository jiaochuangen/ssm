package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public ModelAndView list(){
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        return new ModelAndView("test");
    }
}
