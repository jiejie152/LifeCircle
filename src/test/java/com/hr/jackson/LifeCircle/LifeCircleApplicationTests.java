package com.hr.jackson.LifeCircle;

import com.hr.jackson.LifeCircle.module.test.controller.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LifeCircleApplicationTests {
	//使用MockMvc进行HTTP请求测试
	private MockMvc mvc;

	@Test
	public void contextLoads() {
	}

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
	}
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andDo(MockMvcResultHandlers.print()) //打印mock测试结果
//				.andReturn();
//	}

}