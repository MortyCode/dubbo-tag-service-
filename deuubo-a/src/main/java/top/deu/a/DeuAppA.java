package top.deu.a;

import com.learn.service.env.EnvConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：河神
 * @date ：Created in 2021/9/24 2:02 下午
 */
@EnvConfig(env = "A1")
@SpringBootApplication
public class DeuAppA {
    public static void main(String[] args) {
        SpringApplication.run(DeuAppA.class,args);
    }

}
