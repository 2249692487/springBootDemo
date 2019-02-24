package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述：待描述
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //调用内置的tomcat插件启动运行
        SpringApplication.run(Application.class,args);
    }
}
