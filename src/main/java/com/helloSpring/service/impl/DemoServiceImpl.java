package com.helloSpring.service.impl;

import com.helloSpring.dao.DemoMapper;
import com.helloSpring.entity.Demo;
import com.helloSpring.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    DemoMapper demoMapper;

    @Override
    public List<Demo> select() throws Exception {
        return demoMapper.select();
    }
}
