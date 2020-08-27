package com.jiajia.study.config;

import com.jiajia.study.filter.MyTypeTilter;
import com.jiajia.study.pojo.Person;
import org.springframework.context.annotation.*;

/**
 * @author zjiajia
 * @date 2020/8/26 20:06
 */


@Configuration
@ComponentScans(
        value = {
                @ComponentScan(value="com.jiajia.study",
                                includeFilters = {
                                    /*// 按照注解的方式
                                    @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
                                    // 按照给定的类型，包含子类
                                    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {PersonService.class}),*/
                                    // 按照自定义的规则
                                    @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeTilter.class})
                                },
                                useDefaultFilters = false)
        }
)
public class MainConfig {


    @Bean
    public Person person(){
        return new Person("玊玊",22);
    }
}
