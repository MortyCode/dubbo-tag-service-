package top.deu.b;

import com.learn.service.env.EnvConfig;
import com.learn.service.interceptor.AppConfigurer;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：河神
 * @date ：Created in 2021/9/24 2:02 下午
 */
@EnvConfig(env = "A1")
@Import({AppConfigurer.class})
@SpringBootApplication
public class DeuAppB {

    public static void main(String[] args) {

        SpringApplication.run(DeuAppB.class,args);
    }

}
