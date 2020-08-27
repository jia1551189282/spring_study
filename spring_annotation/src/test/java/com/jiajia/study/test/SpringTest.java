package com.jiajia.study.test;

import com.jiajia.study.config.MainConfig;
import com.jiajia.study.config.MainConfig2;
import com.jiajia.study.config.MainConfig4;
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

    /**
     * 测试    compomentScan 注解的使用
     */
    @Test
    public void testCompomentScan(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanName: beanDefinitionNames) {
            System.out.println(beanName);
        }
    }

    /**
     * 测试    scope
     */
    @Test
    public void testScope(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        Object dog = annotationConfigApplicationContext.getBean("dog");
        Object dog2 = annotationConfigApplicationContext.getBean("dog");
        System.out.println(dog == dog2);
        System.out.println(dog);
    }

    /**
     * 测试    conditional
     */
    @Test
    public void testConditional(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanName: beanDefinitionNames
             ) {
            System.out.println(beanName);
        }
    }
}
