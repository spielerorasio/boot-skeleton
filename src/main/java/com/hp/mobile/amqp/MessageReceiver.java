package com.hp.mobile.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Spieler Orasio
 * on 07-Apr-16.
 */
@Component
public class MessageReceiver {
    private static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);


    @RabbitListener(queues = "someQueue")
    public void process(String payload) {
        logger.info("received message : {}", payload);
    }


}
