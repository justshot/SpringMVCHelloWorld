package com.jsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by shaoliang.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/fly")
    public ModelAndView home(){
        ModelAndView model = new ModelAndView("test");
        model.addObject("message", "Hi, Everyone");
        return model;
    }

    @RequestMapping(value="/fly",method = RequestMethod.POST)
    public String postHome(){
        return "test";
    }

    @RequestMapping(value="/run")
    public String run(){
        return "test";
    }


    @RequestMapping(value="/walk")
    public String gorun(){
        return null;
    }


    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
}
