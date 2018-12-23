package com.hr.jackson.LifeCircle.module.test.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hr.jackson.LifeCircle.module.test.dao.UserMapper;
import com.hr.jackson.LifeCircle.module.test.domain.User;
import com.hr.jackson.LifeCircle.module.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public void deleteBatch(Long[] ids) {
        Arrays.stream(ids).forEach(id->userMapper.deleteByPrimaryKey(id));
    }

    @Override
    public List<User> queryUserList() {
//        PageHelper.startPage(page.getPage(),page.getRows());
        return userMapper.getUsers();
    }
}
