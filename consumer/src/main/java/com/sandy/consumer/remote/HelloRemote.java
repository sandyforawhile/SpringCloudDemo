package com.sandy.consumer.remote;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloRemote
 * @Author sandy.n.hao
 * @Date: 2019-02-22
 * @Version v1.0.0
 * @Description: //TODO
 */


public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
