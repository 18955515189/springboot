package com.maven.springboot.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * ActiviMq 消费者
 * Created by Administrator on 2019/4/14.
 */
@Component
public class Consumer {

    @JmsListener(destination = "itcast.queue")
    public void readItcastQueue(String text){
        System.out.println(text+"Ll");
    }
}
