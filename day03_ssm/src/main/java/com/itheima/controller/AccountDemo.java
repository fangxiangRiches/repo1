package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
@SuppressWarnings("all")
public class AccountDemo {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层查询所有账户");
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        return "list";
    }
    @RequestMapping("/saveAccount")
    public String saveAcount(Account account){
       System.out.println(account);
        accountService.saveAccount(account);
        return "list";
    }
}
