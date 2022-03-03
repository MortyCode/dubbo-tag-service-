package com.learn.service.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author ：河神
 * @date ：Created in 2021/9/25 6:15 下午
 */
public class EnvironmentPostConfig implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment,
                                       SpringApplication application) {

        Class<?> mainApplicationClass = application.getMainApplicationClass();
        EnvConfig annotation = mainApplicationClass.getAnnotation(EnvConfig.class);
        if (annotation!=null){
            EnvContext.setEnv(annotation.env());
        }
    }
}
