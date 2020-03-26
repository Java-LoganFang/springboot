package com.example.cache;

import com.example.cache.mapper.sp_tpeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CacheApplicationTests {
    @Autowired
    sp_tpeMapper sp_tpeMapper;

    @Test
    void contextLoads() {
        System.out.println(sp_tpeMapper.getTypeByid(1));
    }

}
