package com.jiajia.study.test;

import com.jiajia.study.config.MainConfig;
import com.jiajia.study.pojo.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zjiajia
 * @date 2020/8/26 20:09
 */
public class SpringTest {

    @Test
    public void testBean(){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
