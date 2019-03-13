package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer
{
    @JmsListener(destination = "queue")
    public void get(String msg)
    {
        System.out.println("接收到----" + msg);
    }

    /*@JmsListener(destination = "topic", containerFactory = "jmsListenerContainerTopic")
    public void get2(String msg)
    {
        System.out.println("接收到---" + msg);
    }*/
}
