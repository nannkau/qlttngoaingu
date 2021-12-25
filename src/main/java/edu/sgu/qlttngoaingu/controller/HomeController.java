package edu.sgu.qlttngoaingu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"/","/index.html","/index"})
    public String index(){
        return "home";
    }
}
