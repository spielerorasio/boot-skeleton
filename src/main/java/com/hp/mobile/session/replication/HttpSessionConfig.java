package com.hp.mobile.session.replication;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Spieler Orasio
 * on 08-Apr-16.
 * http://docs.spring.io/spring-session/docs/current/reference/html5/guides/boot.html
 */
@EnableRedisHttpSession // <1>
public class HttpSessionConfig { }
