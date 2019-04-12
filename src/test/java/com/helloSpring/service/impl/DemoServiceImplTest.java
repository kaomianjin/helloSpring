package com.helloSpring.service.impl;

import com.helloSpring.dao.DemoMapper;
import com.helloSpring.entity.Demo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class DemoServiceImplTest {

    private ApplicationContext applicationContext;

    private DemoMapper mapper;


    @Before
    public void setUp() throws Exception {

        applicationContext = new ClassPathXmlApplicationContext("classpath:configs/spring-mybatis.xml");
        mapper = applicationContext.getBean(DemoMapper.class);
        applicationContext = new ClassPathXmlApplicationContext("classpath:configs/spring-mvc.xml");
        // 导入需要测试的

    }

    @After
    public void tearDown() throws Exception {
    }

    @Before
    public void init(){

    }

    @Test
    public void select() {
        List<Demo> list=mapper.select();
        System.out.print(list.size());
    }
}