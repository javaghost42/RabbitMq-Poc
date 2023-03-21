package com.rabbitmq.poc.controller;

import com.rabbitmq.poc.pubsub.publisher.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rabbitMq")
public class RabbitController {

    @Autowired
    private Publisher publisher;

    @PostMapping
    public String publishMessage(@RequestParam String message){
        return publisher.publishMessage(message);
    }
}
