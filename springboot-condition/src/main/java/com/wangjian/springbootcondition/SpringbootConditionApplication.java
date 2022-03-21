package com.wangjian.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootConditionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);

        // 获取Bean，RedisTemplate
        Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);

        // 获取user的Bean
        Object user = context.getBean("user");
        System.out.println(user);
    }

}
