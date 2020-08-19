package com.jiajia.study.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zjiajia
 * @Date 2020/8/19 13:45
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    /**
     * 车的名称
     */
    private String carName;
    /**
     * 车的颜色
     */
    private String color;
    /**
     * 车的价格
     */
    private Integer price;

}
