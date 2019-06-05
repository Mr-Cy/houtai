package com.qhit.parking;

import com.qhit.parking.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingApplicationTests {
@Autowired
    RedisTemplate redisTemplate;
@Autowired
    StringRedisTemplate stringRedisTemplate;
@Autowired
    RedisUtil redisUtil;
    @Test
    public void contextLoads() {
//        redisUtil.set("name","张三");

    }

}
