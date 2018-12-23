package com.hr.jackson.LifeCircle.module.test.service;



import com.github.pagehelper.Page;
import com.hr.jackson.LifeCircle.module.test.domain.User;
import com.hr.jackson.LifeCircle.module.test.service.impl.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService{
    public void deleteBatch(Long[] ids);
    public List<User> queryUserList();
}
