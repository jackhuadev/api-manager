package com.lettin.apimanager.controller;

import org.apache.shiro.authz.annotation.RequiresGuest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zhanghuapei
 * @Date 2018/10/8 0008 14:44
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello ";
    }


    @RequestMapping("/jsp")
    public String home(Model model) {
        model.addAttribute("name","hello world");
        return "home";
    }
}
