package com.shuangye.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by xxie
 * on 2019/3/4
 */
@Controller
public class UserController {
    @GetMapping({"/index","home",""})
    public String getHome(){
        return "index";
    }

}
