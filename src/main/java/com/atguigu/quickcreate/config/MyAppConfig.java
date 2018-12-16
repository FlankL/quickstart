package com.atguigu.quickcreate.config;

import com.atguigu.quickcreate.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Configuration指明当前类就是一个配置类，就是来替代之前的Spring的配置文件
 *
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中;容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean 给容器中添加组件");
        return new HelloService();
    }
}
