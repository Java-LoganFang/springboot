package com.amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class AmqpApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {
        //Message需要自己构建一个；定义消息体内容和消息头
        //rannitTemplate.send(exchange,routekey.message);

        //object默认当做消息体，只需要传入要发送的对象，自动序列化发送给rabbitmq
        //rabbitTemplate.converAndSend(exchange,routeKey,object)
        Map<String,Object> map = new HashMap<>();
        map.put("msg","这是第一个消息");
        map.put("data", Arrays.asList("Helloword",123,true));
        //对象默认虚拟化
        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",map);
    }

    @Test
    public  void receive(){
        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
