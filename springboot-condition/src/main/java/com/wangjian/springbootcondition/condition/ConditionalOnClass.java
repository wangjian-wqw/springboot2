package com.wangjian.springbootcondition.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author Tom.wang
 * @date 2022/3/21 14:13
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface ConditionalOnClass {
    String[] value();
}
