package com.jiajia.study.service.impl;

import com.jiajia.study.domain.Account;
import com.jiajia.study.mapper.AccountMapper;
import com.jiajia.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjiajia
 * @date 2020/8/25 14:07
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Override
    public List<Account> findAll() {

        System.out.println("查询所有账户信息");
        return accountMapper.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
    }
}
