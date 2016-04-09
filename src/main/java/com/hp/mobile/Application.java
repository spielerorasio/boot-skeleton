package com.hp.mobile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Spieler Orasio
 * on 02-Apr-16.
 */
@RestController
@SpringBootApplication // equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
//@Import(value = {MessageConfiguration.class,HttpSessionConfig.class} )
//@EnableRabbit
//@RabbitAutoConfiguration
public class Application {
    @Value("${server.port}")
    private int serverPort;
    @Value("${server.address}")
    private String serverAddress;


    @RequestMapping("/")
    String hello() {
        return "Hello Docker World : from ("+serverAddress + ":"+serverPort+")";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}
