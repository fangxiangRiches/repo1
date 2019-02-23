package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


/**
 * mybatis环境测试
 */
public class TestMybatis {
    /**
     * 查询所有
     * @throws Exception
     */
    @Test
    public void run1()throws Exception{
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获得sqlSession对象
        SqlSession sqlSession = factory.openSession();
        //调用sqlSession中的getMapper方法获得代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //获得结果集
        List<Account> list = dao.findAll();
        //便利结果集
        for (Account account : list) {
            System.out.println(account);
        }

        sqlSession.close();
        is.close();
    }

    /**
     * 保存
     * @throws Exception
     */
    @Test
    public void run2()throws Exception{
        //创建Account对象
        Account account = new Account();
        //给Account赋值
        account.setName("杨逍");
        account.setMoney(1111d);
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //通过工厂获得sqlSession对象
        SqlSession sqlSession = factory.openSession();
        //调用sqlSession中的getMapper方法获得代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //调用dao接口中的保存方法
        dao.saveAccount(account);
        //每次改动数据之后都要提交事务,要不然数据存不进去
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        is.close();
    }
}
