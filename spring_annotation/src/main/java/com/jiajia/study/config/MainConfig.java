package com.jiajia.study.config;

import com.jiajia.study.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjiajia
 * @date 2020/8/26 20:06
 */


@Configuration
public class MainConfig {


    @Bean
    public Person person(){
        return new Person("玊玊",22);
    }
}
