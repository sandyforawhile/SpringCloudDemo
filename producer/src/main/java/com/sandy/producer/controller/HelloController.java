package com.sandy.producer.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: HelloController
 * @Author sandy.n.hao
 * @Date: 2019-02-22
 * @Version v1.0.0
 * @Description: //TODO
 */

@Api
@RestController
public class HelloController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String,String> index(@RequestParam String name){

        Map<String,String> resMap = new HashMap<>();
        resMap.put("name","sandyforawhile");
        resMap.put("message","success");
        return resMap;
    }

}
