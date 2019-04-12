package com.helloSpring.service;

import com.helloSpring.entity.Demo;

import java.util.List;

public interface DemoService {

    List<Demo> select() throws Exception;
}
