package com.hp.mobile.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Spieler Orasio
 * on 07-Apr-16.
 */
@Configuration
public class MessageConfiguration {



    @Bean
    public Queue someQueue() {
        return new Queue("someQueue");
    }

}
