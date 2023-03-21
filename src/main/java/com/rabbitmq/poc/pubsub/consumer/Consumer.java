package com.rabbitmq.poc.pubsub.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @RabbitListener(queues = {"${rabbitmq.props.queue}"})
    public void rabbitConsumer(String message){
        log.info("Message Received =>  {}",message);
    }
}
