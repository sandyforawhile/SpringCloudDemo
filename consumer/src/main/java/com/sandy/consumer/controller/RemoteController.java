package com.sandy.consumer.controller;

import com.sandy.consumer.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FeignController
 * @Author sandy.n.hao
 * @Date: 2019-02-26
 * @Version v1.0.0
 * @Description: //TODO
 */

@RestController
public class RemoteController {

    @Autowired
    private Iservice iservice;

    @RequestMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name)
    {
        return iservice.SayHello(name);

    }
}
