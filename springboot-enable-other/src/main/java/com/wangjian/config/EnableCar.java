package com.wangjian.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Tom.wang
 * @date 2022/3/21 15:17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(CarConfig.class)
public @interface EnableCar {
}
