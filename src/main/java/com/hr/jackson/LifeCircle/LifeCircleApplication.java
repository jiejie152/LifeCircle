package com.hr.jackson.LifeCircle;

import com.hr.jackson.LifeCircle.util.MyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.hr.jackson.LifeCircle.module.test.dao", markerInterface = MyMapper.class)
public class LifeCircleApplication {
	public static void main(String[] args) {
		SpringApplication.run(LifeCircleApplication.class, args);
	}
}
