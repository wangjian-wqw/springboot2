package com.wangjian.springbootcondition.config;

import com.wangjian.springbootcondition.condition.ClassCondition;
import com.wangjian.springbootcondition.condition.ConditionalOnClass;
import com.wangjian.springbootcondition.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom.wang
 * @date 2022/3/21 13:38
 */
@Configuration
public class UserConfig {

    @Bean
    // @Conditional(ClassCondition.class)
    @ConditionalOnClass({"redis.clients.jedis.Jedis", "com.alibaba.fastjson.JSON"})
    public User user(){
        return new User();
    }
}
