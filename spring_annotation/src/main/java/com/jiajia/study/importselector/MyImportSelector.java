package com.jiajia.study.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zjiajia
 * @date 2020/8/27 23:44
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.jiajia.study.pojo.Blue","com.jiajia.study.pojo.Red"};
    }
}
