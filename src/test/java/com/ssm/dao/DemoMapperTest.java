package com.ssm.dao;

import com.ssm.entity.Demo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.awt.*;
import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration
@WebAppConfiguration("classpath:spring/spring-mybatis.xml")
public class DemoMapperTest {

    private ApplicationContext applicationContext;

    private DemoMapper mapper;


    @Before
    public void setUp() throws Exception {

        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(DemoMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() {

        List<Demo> demoList=mapper.select();
        System.out.print(demoList.size());
        Demo demo = new Demo();
        demo.setName("张二狗");
        demo.setDelete(false);
        demo.setGmtCreate(1L);
        demo.setGmtModified(1L);
        mapper.insert(demo);

    }
}