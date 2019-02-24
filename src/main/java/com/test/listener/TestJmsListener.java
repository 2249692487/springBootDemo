package com.test.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 描述：消息消费者
 */
@Component
public class TestJmsListener {
    @JmsListener(destination = "test-Queue1")
    public void testConsumer(String text) {
        System.out.println("======" + text);
    }

    @JmsListener(destination="send_map")
    public void readMap(Map map){
        System.out.println(map);
    }
}
