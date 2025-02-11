package com.example.consumer.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
public class ListenerConsumer {


    @KafkaListener(
            groupId = "group-1",
            topicPartitions = @TopicPartition(
                    topic = "str-topic",
                    partitions = {"0"} // Escutando apenas a partição 0
            ),
            containerFactory = "configurer"
    )
    public void listenerPartition0(String message) {
        System.out.println("Listener Partition 0 ::: " + message);
    }

    @KafkaListener(
            groupId = "group-1",
            topicPartitions = @TopicPartition(
                    topic = "str-topic",
                    partitions = {"1"} // Escutando apenas a partição 1
            ),
            containerFactory = "configurer"
    )
    public void listenerPartition1(String message) {
        System.out.println("Listener Partition 1 ::: " + message);
    }

}
