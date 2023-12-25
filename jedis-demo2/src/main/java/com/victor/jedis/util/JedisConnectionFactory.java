package com.victor.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/*
 *Author：Victor_htq
 *Package：com.victor.jedis.util
 *Project：parent
 *name：JedisConnectionFactory
 *Date：2023/12/25  19:48
 *Filename：JedisConnectionFactory
 */
public class JedisConnectionFactory {
    private static final JedisPool JEDIS_POOL;

    static {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(8);
        poolConfig.setMaxIdle(8);
        poolConfig.setMinIdle(0);
        poolConfig.setMaxWaitMillis(1000);
        JEDIS_POOL = new JedisPool(poolConfig,
                "127.0.0.1", 6379, 1000);
    }

    public static Jedis getJedis() {
        return JEDIS_POOL.getResource();
    }
}
