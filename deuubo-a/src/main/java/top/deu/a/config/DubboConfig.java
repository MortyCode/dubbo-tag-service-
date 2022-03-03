package top.deu.a.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：河神
 * @date ：Created in 2021/7/1 11:37 下午
 */
@Configuration
@EnableDubbo(scanBasePackages = "top.deu.a")
@PropertySource("classpath:dubbo-provider.properties")
public class DubboConfig {
}
