package com.kafka.kafkawebsocket.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {
    @Bean
    public NewTopic AccentTopic() {
        return TopicBuilder.name("accentWebSocket").build();
    }
}
