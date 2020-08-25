package com.jiajia.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjiajia
 * @date 2020/8/25 14:08
 */

@Controller
public class AccountController {


    @RequestMapping("/test")
    public String controllerTest(){

        return "success";
    }



}
