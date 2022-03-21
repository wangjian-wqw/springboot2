package com.wangjian.springbootenable;

import com.wangjian.config.CarConfig;
import com.wangjian.config.EnableCar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @ComponentScan 扫描范围：当前引导类所在包及其子包
 * // 导入的几种方法：
 *      1、使用@ComponentScan扫描想要加入的配置
 *      2、可以使用import注解加载类.这些类都会被springboot创建，并放入IOC容器
 *      3、可以对import注解进行封装
 */
// @ComponentScan("com.wangjian.config")
// @Import(CarConfig.class)
@EnableCar
@SpringBootApplication
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

        // 获取Bean
        Object car = context.getBean("car");
        System.out.println(car);
    }

}
