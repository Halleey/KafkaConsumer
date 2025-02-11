package com.example.consumer.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerConsumer {


    @KafkaListener(groupId =  "group-1", topics = "str-topic", containerFactory = "configurer")
    public void listener(String message) {
        System.out.println("Listener :::Receive message {}" + message);
    }

}
