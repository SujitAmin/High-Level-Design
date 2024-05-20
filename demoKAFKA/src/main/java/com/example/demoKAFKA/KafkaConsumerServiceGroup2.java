package com.example.demoKAFKA;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceGroup2 {

    @KafkaListener(topics = "user_topic", groupId = "group2")
    public void consumeFromGroup2(String message) {
        System.out.println("Consumer Group 2 received: " + message);
    }
}

