package com.jiajia.study.controller;

import com.jiajia.study.domain.Account;
import com.jiajia.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zjiajia
 * @date 2020/8/25 14:08
 */

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;


    @RequestMapping("/test")
    @ResponseBody
    public List<Account> controllerTest(){
        List<Account> accountList = accountService.findAll();
        return accountList;
    }



}
