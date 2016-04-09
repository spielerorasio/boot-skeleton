package com.hp.mobile.redis;

/**
 * Created by Spieler Orasio
 * on 08-Apr-16.
 */
public interface CacheClient {
    void put(String key, String value);
    String get(String key);
    boolean exists(String key);
}
