package com.rabbitmq.rabbitmqconsumer.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * Queue의 정보를 받아주기 위한 Listener
 */
@Component
@Slf4j
public class ConsumerListener {

    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(final Message message) {
        log.info(message.toString());
    }
}
