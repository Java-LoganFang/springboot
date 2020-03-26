package com.example.cache;

import com.example.cache.Bean.sp_type;
import com.example.cache.mapper.sp_tpeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class CacheApplicationTests {
    @Autowired
    sp_tpeMapper sp_tpeMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;//操作k-v都是字符串的
    @Autowired
    RedisTemplate redisTemplate;  //k-v都是对象
//
//    @Autowired
//    RedisTemplate<Object,Object> rmRedisTemplate;

    @Test
    void testReids(){
        //默认java自己的序列化
        //stringRedisTemplate.opsForValue().append("msg","hello");
        sp_type type=new  sp_type();
        type.setDelete_time(1);
        type.setType_name("名字");
        type.setType_id(2);
        redisTemplate.opsForValue().set("Type",type);
        //rmRedisTemplate.opsForValue().set("Type",type);
    }

    @Test
    void contextLoads() {
        System.out.println(sp_tpeMapper.getTypeByid(1));
    }

}
