package com.example.demoKAFKA;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceGroup1 {

    @KafkaListener(topics = "user_topic", groupId = "group1")
    public void consumeFromGroup1(String message) {
        System.out.println("Consumer Group 1 received: " + message);
    }
}
