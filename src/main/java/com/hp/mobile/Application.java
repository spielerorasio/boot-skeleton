package com.hp.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * Created by Spieler Orasio
 * on 02-Apr-16.
 */
@RestController
@SpringBootApplication // equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan
//@Import(value = {MessageConfiguration.class,HttpSessionConfig.class} )
//@EnableRabbit
//@RabbitAutoConfiguration
public class Application  {
    @Autowired
    Environment environment;


    @RequestMapping("/")
    String hello() throws UnknownHostException {
        return "Hello Docker World : from ("+ Inet4Address.getLocalHost().getHostAddress() + ":"+environment.getProperty("local.server.port")+")";

    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}
