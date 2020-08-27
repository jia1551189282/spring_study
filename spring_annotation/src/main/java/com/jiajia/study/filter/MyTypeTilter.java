package com.jiajia.study.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author zjiajia
 * @date 2020/8/27 18:14
 */
public class MyTypeTilter implements TypeFilter {

    /**
     * metadataReader：读取到的当前正在扫描的类的信息
     * metadataReaderFactory:可以获取到其他任何类信息的
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类的路径
        Resource resource = metadataReader.getResource();
        System.out.println(resource);
        String className = classMetadata.getClassName();
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
