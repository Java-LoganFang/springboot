package com.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1，RabbitAutoConfiguration
 * 2，有自动配置了连接工厂ConnectionFactory
 * 3，RabbitProperties 封装了RabbitMq配置
 * 4，RabbitTemplate：给RabbitMQ发送和接受消息
 * 5，AmqpAdmin：RabbitMQ系统管理功能组件
 */
@EnableRabbit//开启基于注解的RabbitMQ
@SpringBootApplication
public class AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmqpApplication.class, args);
    }

}
