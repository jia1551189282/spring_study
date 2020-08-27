package com.jiajia.study.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zjiajia
 * @date 2020/8/27 22:44
 *
 * 判断是否是linux 系统
 */

public class LinuxCondition implements Condition {
    /**
     *
     * @param conditionContext          判断条件能使用的上下文
     * @param annotatedTypeMetadata     注释信息
     * @return                          判断是否成立
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        // 1 可以得到 ioc 的beanFactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 2 获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        // 3 获取环境信息
        Environment environment = conditionContext.getEnvironment();
        // 4 获取到bean 定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");

        // 判断容器中 bean 的注册情况，也可以给容器中注册bean
        boolean person = registry.containsBeanDefinition("person");

        if(property.contains("linux")){
            return true;
        }
        return false;
    }
}
