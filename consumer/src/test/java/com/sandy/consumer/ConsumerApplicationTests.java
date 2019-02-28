package com.sandy.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import wiremock.org.hamcrest.core.Is;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureStubRunner(ids = {"com.springboot.cloud:producer:0.0.1-SNAPSHOT:stubs:7001"},
		stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class ConsumerApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void  contextLoads() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hello/sandyforawhile111"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("name", Is.is("sandyforawhile111")))
				.andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("message", Is.is("success")));

//		String responseStr = mvc.perform(MockMvcRequestBuilders.get("/hello").param("name","sandyforawhile111"))
//				.andReturn().getResponse().getContentAsString();
	}

}
