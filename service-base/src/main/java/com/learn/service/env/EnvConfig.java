package com.learn.service.env;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：河神
 * @date ：Created in 2021/9/25 6:14 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EnvConfig {
    /**
     * 服务启动环境标识
     * @return
     */
    String env() default "";
}
