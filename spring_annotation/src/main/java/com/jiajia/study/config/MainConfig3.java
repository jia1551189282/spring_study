package com.jiajia.study.config;

import com.jiajia.study.conditional.LinuxCondition;
import com.jiajia.study.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author zjiajia
 * @date 2020/8/27 22:41
 */

@Configuration
@Conditional(LinuxCondition.class)
public class MainConfig3 {

    @Bean
//    @Conditional(LinuxCondition.class)
    public Person person01(){
        return new Person("linus",50);
    }


    @Bean
//    @Conditional(WindowsCondition.class)
    public Person person02(){
        return new Person("bill",67);
    }
}
