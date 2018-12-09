package com.hr.jackson.LifeCircle.controller;

import com.hr.jackson.LifeCircle.domain.WebInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private WebInfo webInfo;

    @RequestMapping("/hello")
    public String index() {
        return webInfo.toString();
    }
}
