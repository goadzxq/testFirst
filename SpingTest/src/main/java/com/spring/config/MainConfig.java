package com.spring.config;


import com.spring.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration//这是一个配置类
public class MainConfig {

    @Bean("person")
    public Person person(){
        return new Person("lisi", 20);
    }

}
