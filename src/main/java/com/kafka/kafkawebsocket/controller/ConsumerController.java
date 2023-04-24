package com.kafka.kafkawebsocket.controller;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ConsumerController {

    private final SimpMessagingTemplate messagingTemplate;

    public ConsumerController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @KafkaListener(topics = "accentWebSocket", groupId = "accent")
    public void handleMessage(String message) {
        messagingTemplate.convertAndSend("/kafka", message);
    }

}
