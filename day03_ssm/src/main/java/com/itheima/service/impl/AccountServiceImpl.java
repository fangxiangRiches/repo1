package com.itheima.service.impl;
import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
@SuppressWarnings("all")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有用户");
        return accountDao.findAll();

    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户");
        accountDao.saveAccount(account);
    }
}
