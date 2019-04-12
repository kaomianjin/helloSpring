package com.helloSpring.dao;

import com.helloSpring.entity.Demo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoMapper {

    void insert(Demo demo);

    List<Demo>select();
}
