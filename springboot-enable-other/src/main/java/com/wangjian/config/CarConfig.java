package com.wangjian.config;

import com.wangjian.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom.wang
 * @date 2022/3/21 15:08
 */
@Configuration
public class CarConfig {

    @Bean
    public Car car(){
        return new Car();
    }
}
