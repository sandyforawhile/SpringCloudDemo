package com.sandy.producer;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.sandy.producer.controller.HelloController;
import org.junit.Before;

/**
 * @ClassName: MvcMockTest
 * @Author sandy.n.hao
 * @Date: 2019-02-27
 * @Version v1.0.0
 * @Description: //TODO
 */

public class MvcMockTest {

    @Before
    public void setsup(){
        RestAssuredMockMvc.standaloneSetup(new HelloController());
    }
}
