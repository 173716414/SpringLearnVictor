package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

/*
 *Author：Victor_htq
 *Package：com.victor.test
 *Project：parent
 *name：JedisTest
 *Date：2023/12/25  19:27
 *Filename：JedisTest
 */
public class JedisTest {
    private Jedis jedis;

    @BeforeEach
    void setUp() {
        // 1.建立连接
        jedis = new Jedis("127.0.0.1", 6379);
    //     设置密码
    //     jedis.auth();
        jedis.select(0);
    }

    @Test
    void testString() {
        String result = jedis.set("name", "vicc");
        System.out.println(result);

        String name = jedis.get("name");
        System.out.println(name);
    }

    @Test
    void testHash() {
        jedis.hset("user:1", "name", "jack");
        jedis.hset("user:1", "age", "21");
        Map<String, String> map = jedis.hgetAll("user:1");
        System.out.println(map);
    }
    @AfterEach
    void teatDown() {
        if (jedis != null) {
            jedis.close();
        }
    }

}
