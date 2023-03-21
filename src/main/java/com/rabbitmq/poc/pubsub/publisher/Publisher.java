package com.rabbitmq.poc.pubsub.publisher;

import com.rabbitmq.poc.utils.RabbitMqProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.rabbitmq.poc.utils.ApplicationConstants.MESSAGE_PUBLISHED;

@Service
@Slf4j
public class Publisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RabbitMqProperties properties;

    public String publishMessage(String message){
        rabbitTemplate.convertAndSend(properties.getExchange(),properties.getRoutingKey(),message);
        log.info(MESSAGE_PUBLISHED);
        return MESSAGE_PUBLISHED;
    }
}
