package com.kafka.kafkawebsocket.controller;

import com.kafka.kafkawebsocket.records.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @MessageMapping("/messages")
    public void handleMessage(@Payload MessageRequest request) {
        kafkaTemplate.send("accentWebSocket", request.message());
    }

}
