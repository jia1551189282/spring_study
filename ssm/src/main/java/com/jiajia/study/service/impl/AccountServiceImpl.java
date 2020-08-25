package com.jiajia.study.service.impl;

import com.jiajia.study.domain.Account;
import com.jiajia.study.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjiajia
 * @date 2020/8/25 14:07
 */

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {

        System.out.println("查询所有账户信息");
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }
}
