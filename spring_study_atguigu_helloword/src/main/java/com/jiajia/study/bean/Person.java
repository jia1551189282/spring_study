package com.jiajia.study.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author zjiajia
 * @Date 2020/8/18 20:50
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String lastName = "小虎";
    private String email;
    private String gender;
    private Integer age;

    private Car car;

    private List<Book> books;

    private Map<String,Object> map;

    private Properties properties;
}
