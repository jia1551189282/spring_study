package com.jiajia.study.config;

import com.jiajia.study.importselector.MyBeanDefinitionRegistry;
import com.jiajia.study.importselector.MyImportSelector;
import com.jiajia.study.pojo.Color;
import com.jiajia.study.pojo.Red;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zjiajia
 * @date 2020/8/27 23:12
 *
 * import 注解 ，往容器中添加bean
 */

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyBeanDefinitionRegistry.class})
public class MainConfig4 {
}
