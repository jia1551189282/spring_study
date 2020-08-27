package com.jiajia.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zjiajia
 * @date 2020/8/27 18:35
 */

@Data
@AllArgsConstructor
public class Dog {

    private String name;

    private Integer age;

    public Dog() {
        System.out.println("dog构造器被调用");
    }
}
