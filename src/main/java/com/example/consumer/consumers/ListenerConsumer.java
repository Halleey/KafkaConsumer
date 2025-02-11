package com.example.consumer.consumers;

import com.example.consumer.config.ConsumerCustomListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class ListenerConsumer {


    @ConsumerCustomListener(groupId ="group-1")
    public void listenerPartition0(String message) {
        System.out.println("Listener Partition 0 ::: " + message);
    }

    @ConsumerCustomListener(groupId = "group-1")
    public void listenerPartition1(String message) {
        System.out.println("Listener Partition 1 ::: " + message);
    }

}
