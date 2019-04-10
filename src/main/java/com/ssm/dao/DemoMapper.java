package com.ssm.dao;

import com.ssm.entity.Demo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoMapper {

    void insert(Demo demo);

    List<Demo>select();
}
