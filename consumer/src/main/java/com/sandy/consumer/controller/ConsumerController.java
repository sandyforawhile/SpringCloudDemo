package com.sandy.consumer.controller;

import com.sandy.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sandy.consumer.remote.HelloRemote;

/**
 * @ClassName: ConsumerController
 * @Author sandy.n.hao
 * @Date: 2019-02-22
 * @Version v1.0.0
 * @Description: //TODO
 */

@RestController
public class ConsumerController {

    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
