package edu.sgu.qlttngoaingu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThiSinhController {
    @RequestMapping(value = {"/thong-tin-thi-sinh.html"})
    public String index(){
        return "thong-tin-thi-sinh";
    }
    @RequestMapping(value = {"/danh-sach-thi-sinh.html"})
    public String list(){
        return "danh-sach-thi-sinh";
    }
}
