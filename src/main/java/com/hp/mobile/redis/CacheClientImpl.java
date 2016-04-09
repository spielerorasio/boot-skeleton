package com.hp.mobile.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * Created by Spieler Orasio
 * on 08-Apr-16.
 */
@Component
public class CacheClientImpl implements CacheClient {
    private static final Logger logger = LoggerFactory.getLogger(CacheClientImpl.class);

    @Autowired
    private StringRedisTemplate template;

    @Override
    public void put(String key, String value) {
        ValueOperations<String, String>  opsForValue = template.opsForValue();
        opsForValue.set(key, value);
    }

    @Override
    public String get(String key) {
        ValueOperations<String, String>  opsForValue = template.opsForValue();
        return opsForValue.get(key);
    }

    @Override
    public boolean exists(String key) {
        return template.hasKey(key);
    }
}
