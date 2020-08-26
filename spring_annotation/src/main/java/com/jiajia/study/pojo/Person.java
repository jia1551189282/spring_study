package com.jiajia.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zjiajia
 * @date 2020/8/26 20:07
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    /**
     * 用户名
     */
    private String username;
    /**
     * 年龄
     */
    private Integer age;
}
