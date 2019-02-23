package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {



    @org.junit.Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }

    @org.junit.Test
    public String run2(){

        return "list";
    }
}
