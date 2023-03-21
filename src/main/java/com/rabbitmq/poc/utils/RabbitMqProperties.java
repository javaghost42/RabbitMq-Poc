package com.rabbitmq.poc.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class RabbitMqProperties {

    @Value("${rabbitmq.props.queue}")
    private String queue;
    @Value("${rabbitmq.props.exchange}")
    private String exchange;
    @Value("${rabbitmq.props.routingKey}")
    private String routingKey;
}
