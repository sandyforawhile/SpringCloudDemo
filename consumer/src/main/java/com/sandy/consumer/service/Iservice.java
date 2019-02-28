package com.sandy.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: Iservice
 * @Author sandy.n.hao
 * @Date: 2019-02-26
 * @Version v1.0.0
 * @Description: //TODO
 */

@FeignClient(name = "producer")
public interface Iservice {

    @RequestMapping(value = "/hello")
    String SayHello(@RequestParam(value="name") String name);

}
