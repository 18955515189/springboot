package com.maven.springboot.controller;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * ActiviMq
 * Created by david on 2019/4/14.
 */
@Controller
@ResponseBody
public class QueueController {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private Queue queue;

    @RequestMapping("/send")
    public void send(){
        this.jmsMessagingTemplate.convertAndSend(this.queue,"我是一个好消息：）");
    }
}
