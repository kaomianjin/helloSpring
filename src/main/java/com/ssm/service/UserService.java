package com.ssm.service;

import com.ssm.entity.Demo;

import java.util.List;

public interface UserService {

    List<Demo> select() throws Exception;
}
