package com.hr.jackson.LifeCircle.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebInfo {
    @Value("${com.hr.title}")
    private String title;

    @Value("${com.hr.author}")
    private String author;

    @Override
    public String toString(){
//        return "Welcome to "+ title + ", this Web is designed by " + author;
        return "欢迎来到"+ title + "网站，本网站作者为：" + author;
    }
}
