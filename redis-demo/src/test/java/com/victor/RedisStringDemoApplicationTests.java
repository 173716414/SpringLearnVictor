package com.victor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.victor.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

@SpringBootTest
class RedisStringDemoApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    // Json工具
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    void testString() {
        stringRedisTemplate.opsForValue().set("name", "黄拓青");
        Object name = stringRedisTemplate.opsForValue().get("name");
        System.out.println(name);
    }

    @Test
    void testSaveUser() throws JsonProcessingException {
        User user = new User("vic", 20);
        String json = MAPPER.writeValueAsString(user);
        stringRedisTemplate.opsForValue().set("user:222", json);
        String val = stringRedisTemplate.opsForValue().get("user:222");
        User user1 = MAPPER.readValue(val, User.class);
        System.out.println(user1);
    }

    @Test
    void testHash() {
        stringRedisTemplate.opsForHash().put("user:333", "name", "Lucy");
        stringRedisTemplate.opsForHash().put("user:333", "age", "18");
        Map<Object, Object> entries = stringRedisTemplate.opsForHash().entries("user:333");
        System.out.println(entries);
    }
}
