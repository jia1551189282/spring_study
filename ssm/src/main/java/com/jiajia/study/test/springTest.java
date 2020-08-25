package com.jiajia.study.test;

import com.jiajia.study.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zjiajia
 * @date 2020/8/25 14:15
 */
public class springTest {

    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService =(AccountService) classPathXmlApplicationContext.getBean(AccountService.class);
        System.out.println(accountService);
        accountService.findAll();
    }
}
