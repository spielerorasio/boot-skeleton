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
//    @Value("spring.rabbitmq.host")
//    private String host;
//    @Value("spring.rabbitmq.port")
//    private String port;
//    @Value("spring.rabbitmq.username")
//    private String username;
//    @Value("spring.rabbitmq.password")
//    private String password;
//    @Value("spring.rabbitmq.virtualHost")
//    private String virtualHost;
//


    @Bean
    public Queue someQueue() {
        return new Queue("someQueue");
    }

//    @Bean
//    public ConnectionFactory connectionFactory()    {
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host, Integer.parseInt(port));
//        connectionFactory.setUsername(username);
//        connectionFactory.setPassword(password);
//        connectionFactory.setVirtualHost(virtualHost);
//        return connectionFactory;
//    }
//
//    @Bean
//    public RabbitTemplate rabbitTemplate()    {
//        RabbitTemplate template = new RabbitTemplate(connectionFactory());
//        template.setMessageConverter(jsonMessageConverter());
//        return template;
//    }
//
//
//    @Bean
//    public AmqpAdmin amqpAdmin()    {
//        return new RabbitAdmin(connectionFactory());
//    }
//
//
//    @Bean
//    public MessageConverter jsonMessageConverter()    {
//        return new Jackson2JsonMessageConverter();
//    }
}
