package com.jiajia.study.domain;

import lombok.Data;

/**
 * @author zjiajia
 * @date 2020/8/25 14:01
 */

@Data
public class Account {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 金额
     */
    private Double money;
}
