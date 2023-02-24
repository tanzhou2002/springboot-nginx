package com.springbootwebnginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexNginxController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        model.addObject("port", port);
        model.setViewName("index");
        return model;
    }
    
}
