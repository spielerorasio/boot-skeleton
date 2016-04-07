package com.hp.mobile;

import com.hp.mobile.amqp.MessageConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Spieler Orasio
 * on 02-Apr-16.
 */
@RestController
@SpringBootApplication // equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
@Import(value = MessageConfiguration.class)
//@EnableRabbit
//@RabbitAutoConfiguration
public class Main {
    @RequestMapping("/")
    String home() {
        return "Hello Docker World";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }


}
