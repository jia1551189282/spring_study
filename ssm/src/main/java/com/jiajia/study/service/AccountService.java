package com.jiajia.study.service;

import com.jiajia.study.domain.Account;

import java.util.List;

/**
 * @author zjiajia
 * @date 2020/8/25 14:07
 */
public interface AccountService {
    /**
     * 查询所有账户
     * @return  账户列表
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account 账户信息
     */
    public void saveAccount(Account account);
}
