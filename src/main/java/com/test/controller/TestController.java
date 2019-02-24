package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    // 获取application.properties配置文件的内容
    @Autowired
    private Environment env;

    @RequestMapping("/getName")
    public String getName() {
        String url = env.getProperty("url");
        return "张三 " + url;
    }
}
