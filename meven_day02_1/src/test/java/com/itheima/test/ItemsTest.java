package com.itheima.test;



import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取代理对象
        ItemsDao dao = ac.getBean(ItemsDao.class);
        //通过代理对象调用方法获得结果集
        Items items = dao.findById(1);
        //输出结果集
        System.out.println(items.getName());
    }


    @Test
    public void findByID(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取代理对象
        ItemsService bean = ac.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId.getName());
    }
}
