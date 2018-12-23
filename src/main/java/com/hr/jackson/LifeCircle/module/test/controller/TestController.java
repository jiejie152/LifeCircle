package com.hr.jackson.LifeCircle.module.test.controller;

import com.hr.jackson.LifeCircle.module.test.domain.User;
import com.hr.jackson.LifeCircle.module.test.domain.WebInfo;
import com.hr.jackson.LifeCircle.module.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private WebInfo webInfo;
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String index() {
//        return webInfo.toString();
        StringBuffer sb = new StringBuffer();
//
//        return sb.toString();
        List<User> users =userService.queryUserList();
        for(User user:users){
            sb.append(user.getName());
        }
        return sb.toString();
    }
}
