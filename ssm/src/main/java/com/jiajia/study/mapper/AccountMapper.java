package com.jiajia.study.mapper;

import com.jiajia.study.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zjiajia
 * @date 2020/8/25 14:09
 */

@Repository
public interface AccountMapper {
    /**
     * 查询所有账户信息
     * @return  账户列表
     */
    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,account) values(#{name},#{account})")
    public void saveAccount(Account account);

}
