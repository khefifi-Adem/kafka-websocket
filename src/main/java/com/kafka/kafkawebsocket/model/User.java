package com.kafka.kafkawebsocket.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Number id;
    private String name;
    private String type;
}
