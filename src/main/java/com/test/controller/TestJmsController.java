package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息生产者
 */

@RestController
@RequestMapping("/jms")
public class TestJmsController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/test")
    public void send(String  text) {
        jmsMessagingTemplate.convertAndSend("test-Queue1", text);
    }

    /**
     * 发送map消息
     */
    @RequestMapping("/sendmap")
    public void sendMap(){
        Map map=new HashMap();
        map.put("mobile", "13900001111");
        map.put("content", "恭喜获得10元代金券");
        jmsMessagingTemplate.convertAndSend("send_map",map);
    }

}