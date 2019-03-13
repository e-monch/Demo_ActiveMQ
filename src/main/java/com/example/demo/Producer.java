package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;

@RestController
public class Producer
{
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;

    @RequestMapping("/send")
    public String send()
    {
        jmsTemplate.convertAndSend(queue, "jmsTemplate.convertAndSend发送的消息");
        //jmsTemplate.send(topic, session -> session.createTextMessage("jmsTemplate.send-creator发送的消息"));
        return "success";
    }
}
