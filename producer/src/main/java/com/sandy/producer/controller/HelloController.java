package com.sandy.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Author sandy.n.hao
 * @Date: 2019-02-22
 * @Version v1.0.0
 * @Description: //TODO
 */

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String index(@RequestParam String name){
        return "Hello " + name + ", this is first message.";
    }
}
