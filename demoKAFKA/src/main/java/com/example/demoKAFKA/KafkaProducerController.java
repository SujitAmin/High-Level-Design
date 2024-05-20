package com.example.demoKAFKA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "user_topic";

    @GetMapping("/publish")
    public String sendMessage(@RequestParam("message") String message, @RequestParam("partition") int partition) {
        kafkaTemplate.send(TOPIC, partition, null, message);
        return "Message sent to Kafka topic " + TOPIC + " to partition " + partition;
    }
}
