package com.wangjian.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author Tom.wang
 * @date 2022/3/21 13:42
 */
public class ClassCondition implements Condition {
    /**
     *
     * @param context:上下文对象，可以获取属性值，获取类加载器，获取BeanFactory等
     * @param metadata:元数据对象，用于获取注解属性。
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 1.需求：导入Jedis坐标后创建Bean
        // 思路：判断redis.clients.jedis.Jedis.class文件是否存在
        /*Environment environment = context.getEnvironment();
        System.out.println(environment);
        boolean flag = true;
        try {
            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;*/

        // 2.需求：导入通过注解属性值value指定坐标后创建Bean
        // 获取注解属性值
        Environment environment = context.getEnvironment();
        System.out.println(environment);
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());
        System.out.println(map);
        String[] value = (String[]) map.get("value");
        boolean flag = true;
        try {
            for (String s : value) {
                Class<?> cls = Class.forName(s);
            }
        } catch (ClassNotFoundException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }
}
