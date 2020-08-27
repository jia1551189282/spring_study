package com.jiajia.study.importselector;

import com.jiajia.study.pojo.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zjiajia
 * @date 2020/8/27 23:49
 */
public class MyBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        // bean 类型定义
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Rainbow.class);
        // bean 信息定义 指定bean 的名称
        beanDefinitionRegistry.registerBeanDefinition("rainbow",rootBeanDefinition);
    }
}
