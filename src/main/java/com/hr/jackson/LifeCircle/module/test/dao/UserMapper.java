package com.hr.jackson.LifeCircle.module.test.dao;

import com.hr.jackson.LifeCircle.module.test.domain.User;
import com.hr.jackson.LifeCircle.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
@Mapper
public interface UserMapper extends MyMapper<User> {
    List<User> getUsers();
}