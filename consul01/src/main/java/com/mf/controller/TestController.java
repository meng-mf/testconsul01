package com.mf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/1
 * @Version V1.0
 **/
@RestController
@RefreshScope
public class TestController {
    @Value("${test.uu}")
    private String testuu;
    @Value("${test.yy}")
    private String testyy;

    @RequestMapping("test01")
    public String test01(){
        return testuu+"--------------------"+testyy;
    }
}
