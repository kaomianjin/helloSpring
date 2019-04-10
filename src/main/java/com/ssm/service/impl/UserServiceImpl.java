package com.ssm.service.impl;

import com.ssm.dao.DemoMapper;
import com.ssm.entity.Demo;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    DemoMapper demoMapper;

    @Override
    public List<Demo> select() throws Exception {
        return demoMapper.select();
    }
}
