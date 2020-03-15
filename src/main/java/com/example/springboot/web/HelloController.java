package com.example.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {

    //根据@RequestMapping设置的字符串来访问方法
    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        if (true) {
            throw new Exception("some exception");
        }
        //根据返回的字符串加上.jsp匹配jsp文件
        return "hello";
    }
}
