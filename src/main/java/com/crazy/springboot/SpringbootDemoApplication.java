package com.crazy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 关闭特定的自动配置使用 @SpringBootApplication 注解的 exclude 参数即可，
// 这里以关闭数据源的自动配置为例
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
