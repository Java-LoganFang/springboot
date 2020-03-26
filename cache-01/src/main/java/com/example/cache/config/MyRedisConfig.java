package com.example.cache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.net.UnknownHostException;

/**
 * 设置redis存储值的时候的字符编码
 */
@Configuration
public class MyRedisConfig {
//    @Bean
//    public RedisTemplate<Object, Object> rmRedisTemplate(
//            RedisConnectionFactory redisConnectionFactory
//    ) throws UnknownHostException {
//        RedisTemplate<Object,Object> template = new RedisTemplate<Object, Object>();
//        template.setConnectionFactory(redisConnectionFactory);
//        Jackson2JsonRedisSerializer<Object> ser = new Jackson2JsonRedisSerializer<Object>(Object.class);
//        template.setDefaultSerializer(ser);
//        return template;
//    }
//
//
//    @Bean
//    public RedisCacheManager employeeCacheManage(RedisTemplate<Object, Object> rmRedisTemplate){
//        RedisCacheManager cacheManager = new RedisCacheManager(rmRedisTemplate);
//        cacheManager.setTransactionAware(true);
//        return cacheManager;
//    }


    @Bean
    public RedisCacheManager JsonCacheManager(RedisConnectionFactory factory) {
        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
                //     使用GenericJackson2JsonRedisSerializer序列化得到Value
                .serializeValuesWith(RedisSerializationContext.SerializationPair.
                        fromSerializer(new GenericJackson2JsonRedisSerializer()));
        return RedisCacheManager.builder(factory)
                .cacheDefaults(config)
                .build();
    }
}
